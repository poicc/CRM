package com.soft.crm.soft.crm.security.config;

/**
 * @description: 全局常量
 * @author: mqxu
 * @date: 2021-12-10
 **/
public class Constants {

    public static String PROJECT_ROOT_DIRECTORY = System.getProperty("user.dir");
    public static final String SECURITY_SALT = "HelloWorld";
    private static final int HASH_ITERATIONS = 1;

    /**
     * 请求头
     */
    public static final String REQUEST_HEADER = "auth-token";
    public static final String REQUEST_HEADER_CONTENT_TYPE = "application/json";
    public static final String REQUEST_METHOD_POST = "POST";
    public static final String REQUEST_METHOD_GET = "GET";

}
