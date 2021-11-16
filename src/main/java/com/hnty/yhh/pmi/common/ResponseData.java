package com.hnty.yhh.pmi.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponseData<T> extends ResponseResult {
    T data = null;

    @Override
    public ResponseData<T> result(boolean success, String message) {
        super.result(success, message);
        return this;
    }
}
