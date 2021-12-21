import constantRoutes, { frameInRoutes } from '@/router/routes'
import layoutHeaderAside from '@/layout/header-aside'
import { menuHeader,menuAside } from '@/menu'
import router from '@/router'
import { uniqueId } from 'lodash'
const StaticMenuHeader = [...menuHeader] // 静态菜单暂存，重新登录后，需要重新加载动态菜单与此处的静态菜单合并
const StaticMenuAside = [...menuAside]
/**
 * @description 给菜单数据补充上 path 字段
 * @description https://github.com/d2-projects/d2-admin/issues/209
 * @param {Array} menu 原始的菜单数据
 */
function supplementPath (menu) {
  return menu.map(e => ({
    ...e,
    path: e.path || uniqueId('d2-menu-empty-'),
    ...e.children ? {
      children: supplementPath(e.children)
    } : {}
  }))
}

function isEmpty (value) {
  if (value == null || value === '') {
    return true
  }
  return false
}
/**
 * 构建路由列表
 * menuType 1=menu 2=btn 3=route
 * @param routers
 * @param list
 * @returns {[]}
 */
function formatRouter (parent, list) {
  if (parent == null) {
    parent = { children: [] }
  }

  list.forEach((item) => {
    let newRouter = parent
    if (item.menuType !== 'button' && !isEmpty(item.menuComponent)) { // 如果是按钮 或者没有配置component，则不加入路由
      let component = null
      if (item.menuComponent === 'layoutHeaderAside') {
        component = layoutHeaderAside
      } else {
        component = () => import('@/business/modules' + item.menuComponent)
      }
      const children = parent.children
      newRouter = {
        path: item.menuPath,
        name: item.menuName,
        hidden: false,
        // 动态路由支持懒加载
        component: component,
        meta: {
          title: item.menuName,
          auth: true,
          cache: true
        }
      }
      children.push(newRouter)
    }
    if (item.children != null && item.children.length > 0) {
      if (newRouter.children == null) {
        newRouter.children = []
      }
      formatRouter(newRouter, item.children)
    }
  })

  return parent.children
}

/**
 * 构建菜单
 * @param menuTree
 * @returns {[]}
 */
function formatMenu (menuTree) {
  if (menuTree == null) {
    menuTree = []
  }
  let menus = []
  menuTree.forEach((item) => {
    if (item.menuType !== 'menu') { // 只有菜单类型才加入
      return
    }
    let children
    if (item.children != null && item.children.length > 0) {
      children = formatMenu(item.children)
    }
    let icon
    if (item.menuIcon != null && item.menuIcon !== '') {
      icon = item.menuIcon
    }
    menus.push({ path: item.menuPath, title: item.menuName, icon: icon, children: children })
  })
  if (menus.length === 0) {
    menus = undefined
  }
  return menus
}

/**
 * 构建权限码列表
 * @param menuTree
 * @param permissionList
 * @returns {*}
 */
function formatPermissions (menuTree, permissionList) {
  if (menuTree == null) {
    menuTree = []
  }
  menuTree.forEach((item) => {
    if (item != null && item !== '') { // 权限为空
      permissionList.push(item)
    }
    if (item.children != null && item.children.length > 0) {
      formatPermissions(item.children, permissionList)
    }
  })
  return permissionList
}

const state = {
  routes: [],
  addRoutes: [],
  permissions: [],
  inited: false
}

const mutations = {
  setRoutes: (state, { accessedRoutes: routes, permissions }) => {
    state.addRoutes = routes
    state.routes = constantRoutes.concat(routes)
    state.inited = true
    state.permissions = permissions
  },
  clear: () => {
    state.addRoutes = []
    state.routes = []
    state.inited = false
    state.permissions = []
  }
}

const actions = {
  generateRoutes ({ rootState, state, commit }, { menuTree }) {
    return new Promise(resolve => {
      // 处理路由
      const accessedRoutes = formatRouter(null, menuTree) // 根据后台获取到的资源树构建路由列表
      const permissions = formatPermissions(menuTree, []) // 从资源树中抽取权限code列表
      commit('setRoutes', { accessedRoutes, permissions }) // 将菜单和权限存储到vuex里面
      router.addRoutes(accessedRoutes) // 添加动态路由
      // 处理路由 得到每一级的路由设置
      console.log(accessedRoutes)
      commit('d2admin/page/init', frameInRoutes.concat(accessedRoutes), { root: true })

      // 处理菜单
      const menus = supplementPath(formatMenu(menuTree)) // 根据后台获取的资源树，构建菜单
      // menuHeader.splice(0, menuHeader.length)
      // menuHeader.push(...StaticMenuHeader) // 重新构建菜单列表
      // menuHeader.push(...menus) // 将动态菜单放进去

      menuAside.splice(0, menuAside.length)
      menuAside.push(...StaticMenuAside) // 重新构建菜单列表
      menuAside.push(...menus) // 将动态菜单放进去

      // 重新设置顶栏菜单
      commit('d2admin/menu/headerSet', menuHeader, { root: true })
      // 重新设置侧边栏菜单
      if (rootState.d2admin.menu.asideSet == null) {
        let menuDefault = process.env.VUE_APP_D2P_MENU_DEFAULT
        if (menuDefault == null) {
          console.warn('默认左侧菜单未配置：VUE_APP_D2P_MENU_DEFAULT=', process.env.VUE_APP_D2P_MENU_DEFAULT)
          menuDefault = menuAside.length - 1
        }
        const defaultMenuIndex = parseInt(menuDefault)
        if (defaultMenuIndex >= 0) {
          const menus = menuAside[defaultMenuIndex].children || []
          console.log('加载左侧菜单：第', defaultMenuIndex, '个,左侧菜单数据：', menus)
          commit('d2admin/menu/asideSet', menuAside, { root: true })
        }
      }
      // 重新初始化菜单搜索功能
      commit('d2admin/search/init', menuAside, { root: true })

      resolve(true)
    })
  },
  clear ({ commit }) {
    commit('clear')
  }
}

const getters = {
  inited (state) {
    return state.inited
  },
  permissions (state) {
    return state.permissions
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions,
  getters
}
