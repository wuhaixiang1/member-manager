package com.qianfeng.hai.exception;

public class ControllerException extends Exception{
    private String msg;
    private String tip;
    private int status;

    public ControllerException(int status, String msg, String tip) {
        this.msg = msg;
        this.status = status;
        this.tip = tip;
    }
}
