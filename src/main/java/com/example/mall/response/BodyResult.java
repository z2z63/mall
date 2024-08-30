package com.example.mall.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BodyResult<T> {
    private Integer code;
    private String message;
    private T data;

    public static <T> BodyResult<T> success(T data) {
        return new BodyResult<>(ResultCode.SUCCESS.code, ResultCode.SUCCESS.message, data);
    }

    public static <T> BodyResult<T> success() {
        return success(null);
    }

    public static <T> BodyResult<T> fail(String message, T data) {
        return new BodyResult<>(ResultCode.FAILED.code, message, data);
    }

    public static <T> BodyResult<T> fail(T data) {
        return fail(ResultCode.FAILED.message, data);
    }

    public static <T> BodyResult<T> fail() {
        return fail(null);
    }
    public static <T> BodyResult<T> fail(String message) {
        return fail(message, null);
    }

}
