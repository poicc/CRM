package com.soft.crm.security.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 自定义认证管理器
 *
 * @author crq
 */
@Component
public class SystemAuthenticationManager implements AuthenticationManager {

    @Resource
    private SystemAuthenticationProvider systemAuthenticationProvider;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Authentication result = systemAuthenticationProvider.authenticate(authentication);
        if (Objects.nonNull(result)) {
            return result;
        }
        throw new ProviderNotFoundException("权限验证失败，请确认是否数据库或者菜单授权!");
    }

}
