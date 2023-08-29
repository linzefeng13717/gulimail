package com.atguigu.common.exception;

public enum BizCodeEnume {
    UNKNOWN_EXCEPTION(10000, "系统未知错误"),
    VALID_EXCEPTION(10001, "参数格式校验失败");
    ;


    private int code;
    private String error;
    BizCodeEnume(int code, String err) {
        this.code = code;
        this.error = err;
    }

    public int getCode() {
        return code;
    }

    public String getError() {
        return error;
    }
}
