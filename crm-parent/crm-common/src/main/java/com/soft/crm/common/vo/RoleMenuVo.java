package com.soft.crm.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 角色-菜单关联 查询参数
 * @author: crq
 * @date: 2021-12-10
 **/
@Data
@ApiModel(description = "系统管理  角色-菜单关联 查询参数")
public class RoleMenuVo {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @ApiModelProperty(value = "菜单ids")
    private String menuIds;
}
