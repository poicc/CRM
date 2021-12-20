package com.soft.crm.common.vo;

import com.soft.crm.common.entity.SystemUser;
import com.soft.crm.common.entity.SystemRole;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @description: 系统用户Vo 111
 * @author: crq
 * @date: 2021-12-16
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class SystemUserVo extends SystemUser {
    private SystemRole sysRole;
    private String roleId;
    private String roleName;
}

