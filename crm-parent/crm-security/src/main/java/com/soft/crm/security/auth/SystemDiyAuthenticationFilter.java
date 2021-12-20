package com.soft.crm.security.auth;

import com.soft.crm.common.vo.SecurityUser;
import com.soft.crm.security.config.Constants;
import com.soft.crm.service.impl.UserDetailsServiceImpl;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 访问鉴权
 *
 * @author crq
 */
@Slf4j
@Component
public class SystemDiyAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    SystemAuthenticationEntryPoint systemAuthenticationEntryPoint;

    private final UserDetailsServiceImpl userDetailsService;

    protected SystemDiyAuthenticationFilter(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        if (request.getContentType() == null && request.getContentLength() > 0 || (request.getContentType() != null && !request.getContentType().contains("application/json"))) {
            filterChain.doFilter(request, response);
            return;
        }

        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();

            String jwtToken = request.getHeader(Constants.REQUEST_HEADER);
            if (StringUtils.isNotBlank(jwtToken) && !"undefined".equals(jwtToken)) {
                // 检查token
                SecurityUser securityUser = userDetailsService.checkAccountByToken(jwtToken);
                if (securityUser == null || securityUser.getLoginUser() == null) {
                    throw new BadCredentialsException("Token已经过期，请重新登录或者联系管理员！");
                }
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(securityUser, null, securityUser.getAuthorities());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            filterChain.doFilter(request, response);
        } catch (ExpiredJwtException e) {
            SecurityContextHolder.clearContext();
            this.systemAuthenticationEntryPoint.commence(request, response, null);
        } catch (AuthenticationException e) {
            SecurityContextHolder.clearContext();
            this.systemAuthenticationEntryPoint.commence(request, response, e);
        } finally {
            stopWatch.stop();
            long usedTimes = stopWatch.getTotalTimeMillis();
            log.info(String.valueOf(usedTimes));
        }
    }
}
