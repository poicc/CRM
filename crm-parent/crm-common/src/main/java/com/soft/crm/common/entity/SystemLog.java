package com.soft.crm.common.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统日志
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SystemLog extends Model<SystemLog> {

    private Long id;

    private String serviceName;

    private String serviceUrl;

    private String requestIp;

    private String userId;

    private Integer runStatus;

    private String consumingTime;

    private Date createTime;

    private Date updateTime;

    private String serviceType;

    private String httpMethod;

    private String ua;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
