package com.soft.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft.crm.common.entity.SystemRole;
import com.soft.crm.common.vo.SystemRoleVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 系统角色 Mapper 接口
 *
 * @author mqxu
 * @since 2021-12-10
 */
public interface SystemRoleMapper extends BaseMapper<SystemRole> {
    /**
     * 查询所有系统角色
     *
     * @return List
     */
    @Select("SELECT *,id roleId FROM system_role")
    List<SystemRoleVo> getList();

    /**
     * 分页查询系统角色
     *
     * @param pageNum 页码
     * @param pageRow 每页数量
     * @return List
     */
    @Select("SELECT *,id roleId FROM system_role limit #{0},#{1} ")
    List<SystemRoleVo> getRolesByPage(@Param("pageNum") int pageNum, @Param("pageRow") int pageRow);

}
