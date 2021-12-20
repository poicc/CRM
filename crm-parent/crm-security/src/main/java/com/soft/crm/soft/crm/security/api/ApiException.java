package com.soft.crm.soft.crm.security.api;


import java.io.Serial;

/**
 * @description: REST API 请求异常类
 * @author: mqxu
 * @date: 2021-12-10
 **/
public class ApiException extends RuntimeException {
    /**
     * serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = -5885155226898287919L;

    /**
     * 错误码
     */
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
