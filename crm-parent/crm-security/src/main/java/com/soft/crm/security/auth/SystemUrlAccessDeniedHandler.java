package com.soft.crm.security.auth;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import top.mqxu.crm.common.util.ResponseUtil;
import top.mqxu.crm.common.vo.SystemResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 自定义403无权限
 *
 * @author mqxu
 */
@Component
public class SystemUrlAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        ResponseUtil.out(response, SystemResult.createByCodeSuccess(403, e.getMessage(), ""));
    }
}
