package com.soft.crm.common.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统 - 日志表
 * </p>
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SystemLog对象", description="系统 - 日志表")
public class SystemLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "业务名称")
    private String serviceName;

    @ApiModelProperty(value = "业务地址")
    private String serviceUrl;

    @ApiModelProperty(value = "IP")
    private String requestIp;

    @ApiModelProperty(value = "用户id，0:未登录用户操作")
    private Long userId;

    @ApiModelProperty(value = "运行状态")
    private Integer runStatus;

    @ApiModelProperty(value = "后台运行时间")
    private String consumingTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "app,pc")
    private String serviceType;

    @ApiModelProperty(value = "post,get")
    private String httpMethod;

    @ApiModelProperty(value = "浏览器")
    private String ua;


}
