package com.soft.crm.soft.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft.crm.soft.crm.common.entity.SystemMenu;
import com.soft.crm.soft.crm.common.vo.DictType;
import com.soft.crm.soft.crm.common.vo.SystemMenuVo;
import com.soft.crm.soft.crm.common.vo.SystemRoleVo;

import java.util.List;
import java.util.Map;

/**
 * 系统菜单接口
 *
 * @author mqxu
 * @since 2021-12-10
 */
public interface SystemMenuService extends IService<SystemMenu> {
    /**
     * 获取树形菜单
     *
     * @return List
     */
    List<SystemMenuVo> getAllMenusByElTree();

    /**
     * 获取菜单
     *
     * @return Map
     */
    Map<String, List<SystemMenuVo>> getMenusList();

    /**
     * 根据角色id获取角色vo
     *
     * @param roleId 角色ID
     * @return SystemRoleVo
     */
    SystemRoleVo getTree(String roleId);

    /**
     * 获取字典
     *
     * @return List
     */
    List<DictType> getDict();
}
