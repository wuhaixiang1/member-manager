package com.qianfeng.hai.utils;

import lombok.Data;

@Data
public class Result<T> {
    private String msg;
    private String tip;
    private int status;
    private T data;
    //成功时调用的方法
    public static <Y> Result<Y> success(Y data) {
        Result<Y> result = new Result<>();
        result.setData(data);
        result.setMsg(ErrorStatus.SUCCESS.getMsg());
        result.setStatus(ErrorStatus.SUCCESS.getStatus());
        result.setTip(ErrorStatus.SUCCESS.getTip());
        return result;
    }
    //失败时调用的方法
    public static <Y> Result<Y> error() {
        Result<Y> result = new Result<>();
        result.setMsg(ErrorStatus.ERROR.getMsg());
        result.setStatus(ErrorStatus.ERROR.getStatus());
        result.setTip(ErrorStatus.ERROR.getTip());
        return result;
    }

    //异常时调用的方法
    public static <Y> Result<Y> error(ErrorStatus errorStatus) {
        Result result = new Result();
        result.setMsg(ErrorStatus.CONTROLLER_ERROR.getMsg());
        result.setStatus(ErrorStatus.CONTROLLER_ERROR.getStatus());
        result.setTip(ErrorStatus.CONTROLLER_ERROR.getTip());
        return result;
    }
}
