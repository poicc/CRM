package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 自定义字段表
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
public class CrmClients implements Serializable {


    private static final long serialVersionUID = 717067547161226502L;

    @TableId(value = "client_id")
    private String clientId;

    private String clientName;

    private Integer clientType;

    private String clientTelephone;

    private String clientMobile;

    private String clientWebsite;

    private Date lastTime;

    private Integer contactsId;

    private Long createUserId;

    private Long ownerUserId;

    private String clientAddress;

    private String clientMap;

    private String clientDetailAddress;

    private Date createTime;

    private Date updateTime;

    private Integer clientLastStatus;

    private Integer openSeaDay;

    private Integer remark;

    private Integer clientFrom;
}
