package com.soft.crm.common.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 联系人表
 * </p>
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CrmContacts对象", description="联系人表")
public class CrmContacts implements Serializable {

    private static final long serialVersionUID = 1L;

    private String contactsId;

    @ApiModelProperty(value = "公司联系人")
    private String contactsName;

    @ApiModelProperty(value = "最近沟通时间")
    private Date lastTime;

    @ApiModelProperty(value = "手机")
    private String contactsMobile;

    @ApiModelProperty(value = "电话")
    private String contactsTelephone;

    @ApiModelProperty(value = "邮箱")
    private String contactsEmail;

    @ApiModelProperty(value = "公司职务")
    private String title;

    @ApiModelProperty(value = "客户ID")
    private Integer clientId;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建人ID")
    private Long createUserId;

    @ApiModelProperty(value = "负责人ID")
    private Long ownerUserId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
