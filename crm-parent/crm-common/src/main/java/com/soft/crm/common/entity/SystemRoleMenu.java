package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统角色菜单
 *
 * @author mqxu
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SystemRoleMenu extends Model<SystemRoleMenu> {

    private Long id;

    private Long roleId;

    private Long menuId;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
