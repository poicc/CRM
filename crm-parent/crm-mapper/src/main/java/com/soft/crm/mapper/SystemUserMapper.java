package com.soft.crm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft.crm.common.entity.SystemUser;
import org.apache.ibatis.annotations.Mapper;


/**
 * 系统用户 Mapper 接口
 *
 * @author crq
 * @since 2021-12-10
 */
@Mapper
public interface SystemUserMapper extends BaseMapper<SystemUser> {

}
