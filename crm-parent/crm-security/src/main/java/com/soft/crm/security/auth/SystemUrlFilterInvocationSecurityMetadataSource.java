package com.soft.crm.security.auth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.crm.common.entity.SystemMenu;
import com.soft.crm.common.entity.SystemRole;
import com.soft.crm.common.entity.SystemRoleMenu;
import com.soft.crm.mapper.SystemMenuMapper;
import com.soft.crm.mapper.SystemRoleMapper;
import com.soft.crm.mapper.SystemRoleMenuMapper;
import com.soft.crm.security.config.IgnoreUrlConfig;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * 用户角色权限信息
 *
 * @author crq
 */
@Component
public class SystemUrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Resource
    private SystemMenuMapper systemMenuMapper;

    @Resource
    private SystemRoleMenuMapper systemRoleMenuMapper;

    @Resource
    private SystemRoleMapper systemRoleMapper;

    @Resource
    private IgnoreUrlConfig ignoreUrlConfig;

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        //放行的url过滤
        for (String ignoreUrl : ignoreUrlConfig.getNocheck().getIgnoreUrls()) {
            if (ignoreUrl.equals(requestUrl)) {
                return null;
            }
        }

        if (requestUrl.contains("/login")) {
            return null;
        }
        // 查询数据库DB所有url
        List<SystemMenu> permissionList = systemMenuMapper.selectList(null);
        for (SystemMenu permission : permissionList) {
            // 获取该url所对应的权限
            if ((permission.getMenuPath()).equals(requestUrl)) {
                List<SystemRoleMenu> permissions = systemRoleMenuMapper.selectList(new QueryWrapper<SystemRoleMenu>().eq("menu_id", permission.getId()));
                List<String> roles = new LinkedList<>();
                if (!CollectionUtils.isEmpty(permissions)) {
                    permissions.forEach(e -> {
                        Long roleId = e.getRoleId();
                        SystemRole role = systemRoleMapper.selectById(roleId);
                        roles.add(role.getRoleEn());
                    });
                }
                // 角色-权限信息的集合处理
                return SecurityConfig.createList(roles.toArray(new String[0]));
            }
        }

        return SecurityConfig.createList("role_login");
    }


}
