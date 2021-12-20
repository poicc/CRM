package com.soft.crm.common.vo;

import com.soft.crm.common.entity.SystemMenu;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @description: 系统菜单VO类 11
 * @author: crq
 * @date: 2021-12-10
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class SystemMenuVo extends SystemMenu {
    private List<SystemMenuVo> children;
    private List<SystemMenuVo> menuList;
}
