import { request } from '@/api/service'
const apiPrefix = '/api/menus'
export function GetList () {
  return request({
    url: apiPrefix + '/list',
    method: 'post'
  })
}

export function AddObj (obj) {
  return request({
    url: apiPrefix + '/save',
    method: 'post',
    data: obj
  })
}

export function UpdateObj (obj) {
  return request({
    url: apiPrefix + '/update',
    method: 'post',
    data: obj
  })
}
export function DelObj (id) {
  return request({
    url: apiPrefix + '/delete',
    method: 'post',
    params: { id }
  })
}

/**
 * 获取角色权限资源
 * @param roleId
 * @returns {*}
 * @constructor
 */
export function GetPermission (roleId) {
  return request({
    url: '/api/user/permissions',
    method: 'post',
    params: { roleId }
  })
}

// /**
//  * 授权
//  * @param roleId
//  * @param resourceIds
//  * @returns {*}
//  * @constructor
//  */
// export function DoAuthz (roleId, resourceIds) {
//   return request({
//     url: apiPrefix + '/authz',
//     method: 'post',
//     params: { roleId },
//     data: resourceIds
//   })
// }
