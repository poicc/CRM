package com.soft.crm.soft.crm.security.auth;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import top.mqxu.crm.common.vo.SystemResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 暂无权限处理类
 *
 * @author mqxu
 */
@Component
public class SystemAuthAccessDeniedHandler implements AccessDeniedHandler {
    /**
     * 暂无权限返回结果
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exception) {
        SystemResult.createByErrorCodeMessage(403, "无权限");
    }
}