package com.example.mall.response;

import com.example.mall.exception.BaseException;
import com.example.mall.exception.ForbiddenException;
import com.example.mall.exception.UnauthorizedException;
import com.example.mall.exception.ValidateFailedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public BodyResult<String> handleBaseException(Exception e) {
        log.error("发生异常", e);
        if (e instanceof UnauthorizedException) {
            return BodyResult.fail(ResultCode.UNAUTHORIZED.code, e.getMessage());
        } else if (e instanceof ForbiddenException) {
            return BodyResult.fail(ResultCode.FORBIDDEN.code, e.getMessage());
        } else if (e instanceof ValidateFailedException) {
            return BodyResult.fail(ResultCode.VALIDATE_FAILED.code, e.getMessage());
        }
        return BodyResult.fail(e.getMessage());
    }
}
