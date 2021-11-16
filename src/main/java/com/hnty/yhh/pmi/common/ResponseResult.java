package com.hnty.yhh.pmi.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult {

    public static final boolean SUCCESS = true;
    public static final boolean FAIL = false;

    public static final String SUCCESS_MSG = "操作成功";
    public static final String FAIL_MSG = "操作失败";

    boolean success = SUCCESS;

    String message = SUCCESS_MSG;

    public ResponseResult result(boolean success, String message) {
        this.success = success;
        if (message == null) {
            message = success ? SUCCESS_MSG : FAIL_MSG;
        }
        this.message = message;
        return this;
    }

    public ResponseResult(boolean success) {
        this.result(success, null);
    }

    public static ResponseResult ERROR(String message) {
        ResponseResult responseResult = new ResponseResult(FAIL);
        responseResult.setMessage(message);
        return responseResult;
    }
}
