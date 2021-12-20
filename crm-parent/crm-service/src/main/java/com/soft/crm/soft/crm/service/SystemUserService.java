package com.soft.crm.soft.crm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.soft.crm.soft.crm.common.entity.SystemUser;
import com.soft.crm.soft.crm.common.vo.SystemMenuVo;
import com.soft.crm.soft.crm.common.vo.SystemUserInfoVo;
import com.soft.crm.soft.crm.common.vo.SystemUserVo;

import java.util.List;
import java.util.Map;


/**
 * 系统用户服务接口
 *
 * @author mqxu
 * @since 2021-12-10
 */
public interface SystemUserService extends IService<SystemUser> {
    /**
     * 保存用户和角色
     *
     * @param systemUserVo 系统用户vo
     * @return int
     */
    int saveUserAndRole(SystemUserVo systemUserVo);

    /**
     * 更新用户和角色
     *
     * @param systemUserVo 系统用户vo
     * @return int
     */
    int updateUserAndRole(SystemUserVo systemUserVo);

    /**
     * 根据token获取用户信息
     *
     * @param token token
     * @return 用户信息
     */
    SystemUserInfoVo getInfo(String token);

    /**
     * 根据token获取用户菜单权限
     *
     * @param token token
     * @return 菜单权限
     */
    Map<String, List<SystemMenuVo>> getPermissions(String token);
}
