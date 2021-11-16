package com.hnty.yhh.pmi.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponseList<T> extends ResponseResult {
    List<T> list = new ArrayList<>();

    @Override
    public ResponseList<T> result(boolean success, String message) {
        super.result(success, message);
        return this;
    }
}
