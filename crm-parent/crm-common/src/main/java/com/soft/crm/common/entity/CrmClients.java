package com.soft.crm.common.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 自定义字段表
 * </p>
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CrmClients对象", description="自定义字段表")
public class CrmClients implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    private String clientId;

    @ApiModelProperty(value = "客户名称")
    private String clientName;

    @ApiModelProperty(value = "客户类型")
    private Integer clientType;

    @ApiModelProperty(value = "座机")
    private String clientTelephone;

    @ApiModelProperty(value = "手机")
    private String clientMobile;

    @ApiModelProperty(value = "官网")
    private String clientWebsite;

    @ApiModelProperty(value = "默认值")
    private Date lastTime;

    @ApiModelProperty(value = "联系人")
    private Integer contactsId;

    @ApiModelProperty(value = "创建人ID")
    private Long createUserId;

    @ApiModelProperty(value = "负责人ID")
    private Long ownerUserId;

    @ApiModelProperty(value = "地址")
    private String clientAddress;

    @ApiModelProperty(value = "定位信息")
    private String clientMap;

    @ApiModelProperty(value = "详细地址")
    private String clientDetailAddress;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "客户状态 0未沟通 1 沟通中 2 沟通失败")
    private Integer clientLastStatus;

    @ApiModelProperty(value = "公海天数")
    private Integer openSeaDay;

    @ApiModelProperty(value = "备注")
    private Integer remark;

    @ApiModelProperty(value = "客户来源")
    private Integer clientFrom;


}
