package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * CRM联系人
 *
 * @author crq
 * @since 2021-12-10
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CrmContacts extends Model<CrmContacts> {

    @TableId(value = "contacts_id")
    private String contactsId;

    private String contactsName;

    private Date lastTime;

    private String contactsMobile;

    private String contactsTelephone;

    private String contactsEmail;

    private String title;

    private Integer clientId;

    private String address;

    private String remark;

    private Long createUserId;

    private Long ownerUserId;

    private Date createTime;

    private Date updateTime;

    @TableField(exist = false)
    private String clientName;

    @Override
    public Serializable pkVal() {
        return this.contactsId;
    }
}
