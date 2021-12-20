package com.soft.crm.security.auth;

import com.soft.crm.common.entity.SystemUser;
import com.soft.crm.common.util.ResponseUtil;
import com.soft.crm.common.vo.SecurityUser;
import com.soft.crm.common.vo.SystemResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 认证处理
 *
 * @author mqxu
 */
@Component
public class SystemAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse response, Authentication auth) throws IOException, ServletException {
        SystemUser user = new SystemUser();
        SecurityUser securityUser = ((SecurityUser) auth.getPrincipal());
        user.setLoginToken(securityUser.getLoginUser().getLoginToken());
        Map<String, String> map = new HashMap<>();
        map.put("result", "success");
        map.put("loginToken", securityUser.getLoginUser().getLoginToken());
        ResponseUtil.out(response, SystemResult.createByCodeSuccess(200, "登录成功", map));
    }
}
