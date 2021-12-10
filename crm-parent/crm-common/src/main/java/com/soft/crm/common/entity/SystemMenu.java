package com.soft.crm.common.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统-菜单表 
 * </p>
 *
 * @author crq
 * @since 2021-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SystemMenu对象", description="系统-菜单表 ")
public class SystemMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "pid")
    private String parentId;

    private String menuCode;

    @ApiModelProperty(value = "url")
    private String menuPath;

    @ApiModelProperty(value = "权限定义")
    private String menuAuth;

    @ApiModelProperty(value = "vue动态组件")
    private String menuComponent;

    @ApiModelProperty(value = "权限名称")
    private String menuName;

    @ApiModelProperty(value = "排序")
    private Integer menuSort;

    @ApiModelProperty(value = "资源图标")
    private String menuIcon;

    @ApiModelProperty(value = "种类 menu、button")
    private String menuType;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "是否启用")
    private String isEnable;

    @ApiModelProperty(value = "创建者	")
    private Date createUser;

    @ApiModelProperty(value = "describe")
    private String describeText;

    @ApiModelProperty(value = "更新者")
    private String updateUser;


}
