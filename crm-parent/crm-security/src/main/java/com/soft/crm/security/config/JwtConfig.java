package com.soft.crm.security.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description: JWT配置
 * @author: mqxu
 * @date: 2021-12-10
 **/
@Getter
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtConfig {
    /**
     * 密钥key
     */
    public static String secret;

    /**
     * TokenKey
     */
    public static String tokenHeader;

    /**
     * Token前缀字符
     */
    public static String tokenPrefix;

    /**
     * 过期时间
     */
    public static Integer expiration;

    /**
     * 不需要认证的接口
     */
    public static String antMatchers;

    public static void setSecret(String secret) {
        JwtConfig.secret = secret;
    }

    public static void setTokenHeader(String tokenHeader) {
        JwtConfig.tokenHeader = tokenHeader;
    }

    public static void setTokenPrefix(String tokenPrefix) {
        JwtConfig.tokenPrefix = tokenPrefix;
    }

    public static void setExpiration(Integer expiration) {
        JwtConfig.expiration = expiration * 1000;
    }

    public static void setAntMatchers(String antMatchers) {
        JwtConfig.antMatchers = antMatchers;
    }
}
