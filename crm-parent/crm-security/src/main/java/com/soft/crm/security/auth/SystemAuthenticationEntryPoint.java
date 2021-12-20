package com.soft.crm.security.auth;

import com.soft.crm.common.util.ResponseUtil;
import com.soft.crm.common.vo.SystemResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 未登录拦截
 *
 * @author crq
 */
@Slf4j
@Component
public class SystemAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authenticationException) {
        if (authenticationException != null) {
            ResponseUtil.out(response, SystemResult.createByErrorCodeMessage(401, authenticationException.getMessage()));
        } else {
            ResponseUtil.out(response, SystemResult.createByErrorCodeMessage(-1, "token无效或者格式不对"));
        }
    }

}
