package com.soft.crm.common.vo;

/**
 * @description: 响应码枚举
 * @author: crq
 * @date: 2021-12-10
 **/
public enum ResponseCode {
    /**
     * 1.定义枚举值
     */
    ERROR(0, "ERROR"),
    SUCCESS(1, "SUCCESS"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT"),
    NEED_LOGIN(10, "NEED_LOGIN");


    /**
     * 2.定义枚举属性
     */
    private final int code;

    private final String desc;

    /**
     * 3.定义构造方法
     *
     * @param code code
     * @param desc desc
     */
    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 4.定义get方法
     *
     * @return int
     */
    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
