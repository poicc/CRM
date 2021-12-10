package com.soft.crm.common.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 工作台记录表
 * </p>
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CrmWork对象", description="工作台记录表")
public class CrmWork implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "工作台ID")
    private String workId;

    @ApiModelProperty(value = "工作台名称")
    private String workName;

    @ApiModelProperty(value = "工作台类型")
    private String workType;

    @ApiModelProperty(value = "工作台详细介绍")
    private String workTitile;

    @ApiModelProperty(value = "是否展示")
    private String workShow;

    @ApiModelProperty(value = "工作台计数")
    private String workCount;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "上一层级ID")
    private String pid;


}
