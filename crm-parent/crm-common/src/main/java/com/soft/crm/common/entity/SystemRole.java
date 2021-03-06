package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统角色
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SystemRole extends Model<SystemRole> {

    @TableId(value = "id")
    @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private String roleEn;

    private String roleCn;

    private Date createTime;

    private Date updateTime;

    private String describeText;

    private String isEnable;

    private String readonly;

    private String createUser;

    private String updateUser;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
