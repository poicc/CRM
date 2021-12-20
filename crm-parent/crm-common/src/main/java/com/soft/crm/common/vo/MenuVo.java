package com.soft.crm.common.vo;

import com.google.common.collect.Lists;
import com.soft.crm.common.entity.SystemMenu;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 菜单 111
 * @author: crq
 * @date: 2021-12-16
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class MenuVo extends SystemMenu implements Serializable {
    List<MenuVo> children = Lists.newArrayList();

}
