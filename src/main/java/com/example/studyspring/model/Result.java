package com.example.studyspring.model;

import lombok.Data;

@Data
public class Result<T> {
    // 业务编码
    private Integer code;

    // 返回结果
    private T data;

    // 返回消息
    private String msg;

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
