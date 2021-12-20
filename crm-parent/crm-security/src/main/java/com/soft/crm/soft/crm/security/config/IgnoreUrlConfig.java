package com.soft.crm.soft.crm.security.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description: 忽略url的配置
 * @author: mqxu
 * @date: 2021-12-10
 **/
@Data
@Component
@ConfigurationProperties(prefix = "crm")
public class IgnoreUrlConfig {
    /**
     * swagger参数
     */
    private final Swagger swagger = new Swagger();

    private final Nocheck nocheck = new Nocheck();

    /**
     * swagger参数
     */
    @Data
    public static class Swagger {
        private String title;
        private String description;
        private String version;
        private String termsOfServiceUrl;
        private String contactName;
        private String contactUrl;
        private String contactEmail;
        private String license;
        private String licenseUrl;
    }


    @Data
    public static class Nocheck {
        private Integer tokenExpireTime;
        private Integer saveLoginTime;
        private Integer loginTimeLimit;
        private Integer loginAfterTime;
        private List<String> ignoreUrls;
    }

}
