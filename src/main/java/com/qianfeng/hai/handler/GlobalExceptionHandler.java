package com.qianfeng.hai.handler;

import com.qianfeng.hai.exception.ControllerException;
import com.qianfeng.hai.utils.ErrorStatus;
import com.qianfeng.hai.utils.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler
//    public Result exception(Exception e) {
//        if (e instanceof ControllerException) {
//            return Result.error(ErrorStatus.CONTROLLER_ERROR);
//        }
//        return Result.error(ErrorStatus.ERROR);
//    }
    @ExceptionHandler(ControllerException.class)
    public Result ControllerException(ControllerException e) {
        return Result.error(ErrorStatus.CONTROLLER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public Result otherException(Exception e) {
        return Result.error(ErrorStatus.ERROR);
    }
}
