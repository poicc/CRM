package com.soft.crm.common.vo;

import com.soft.crm.common.entity.SystemUser;
import com.soft.crm.common.entity.SystemRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description: 系统角色VO类 111
 * @author: crq
 * @date: 2021-12-10
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemRoleVo extends SystemRole {
    private List<SystemUser> systemUsers;
    private List<SystemRoleMenusVo> sysRoleMenus;
    private List<SystemMenuVo> sysMenuVo;
    private List<String> checkedIds;
}
