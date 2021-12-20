package com.soft.crm.soft.crm.common.vo;


import com.soft.crm.soft.crm.common.entity.SystemRoleMenu;

import java.util.List;

/**
 * @description: 角色菜单Vo
 * @author: mqxu
 * @date: 2021-12-16
 **/
public class SystemRoleMenusVo extends SystemRoleMenu {
    private List<SystemMenuVo> sysMenus;
    private List<String> children;
}
