package com.hnty.yhh.pmi.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponsePage<T> extends ResponseList<T> {
    long total = 0;

    public ResponsePage(List<T> collect, long total) {
        super(collect);
        this.total = total;
    }

    @Override
    public ResponsePage<T> result(boolean success, String message) {
        super.result(success, message);
        return this;
    }
}
