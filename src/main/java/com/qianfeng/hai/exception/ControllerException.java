package com.qianfeng.hai.exception;

import com.qianfeng.hai.utils.ErrorStatus;

public class ControllerException extends Exception{
    private String msg;
    private String tip;
    private int status;

    public ControllerException(int status, String msg, String tip) {
        this.msg = msg;
        this.status = status;
        this.tip = tip;
    }
    public ControllerException(ErrorStatus errorStatus) {
        this.msg = errorStatus.getMsg();
        this.tip = errorStatus.getTip();
        this.status = errorStatus.getStatus();
    }
}
