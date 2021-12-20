package com.soft.crm.soft.crm.security.api;

/**
 * @description: REST API 通用控制器
 * @author: mqxu
 * @date: 2021-12-10
 **/
public class ApiController {
    /**
     * 请求成功
     *
     * @param data 数据内容
     * @param <T>  对象泛型
     * @return ignore
     */
    protected <T> R<T> success(T data) {
        return R.ok(data);
    }

    /**
     * 请求失败
     *
     * @param msg 提示内容
     * @return ignore
     */
    protected <T> R<T> failed(String msg) {
        return R.failed(msg);
    }

    /**
     * 请求失败
     *
     * @param errorCode 请求错误码
     * @return ignore
     */
    protected <T> R<T> failed(IErrorCode errorCode) {
        return R.failed(errorCode);
    }

}
