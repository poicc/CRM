package com.soft.crm.security.api;

/**
 * @description: REST API 错误码接口
 * @author: crq
 * @date: 2021-12-10
 **/
public interface IErrorCode {

    /**
     * 错误编码 -1、失败 0、成功
     *
     * @return long
     */
    long getCode();

    /**
     * 错误描述
     *
     * @return String
     */
    String getMsg();
}