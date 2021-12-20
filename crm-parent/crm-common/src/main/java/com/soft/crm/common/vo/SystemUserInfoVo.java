package com.soft.crm.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.google.common.collect.Sets;
import com.soft.crm.common.entity.SystemUser;
import com.soft.crm.common.entity.SystemRole;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Set;

/**
 * @description: 系统用户信息Vo 111
 * @author: crq
 * @date: 2021-12-16
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class SystemUserInfoVo extends SystemUser implements Serializable {
    private Set<String> menuList;

    private Set<String> permissionList;

    @TableField(exist = false)
    private SystemRole role;

    private Set<String> roles = Sets.newHashSet();

    private Set<MenuVo> menus = Sets.newHashSet();

}

