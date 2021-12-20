package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SystemUserRole extends Model<SystemUserRole> {

    private Long id;

    private String roleId;

    private String userId;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
