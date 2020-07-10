package com.qianfeng.hai.utils;

import lombok.Data;


public enum ErrorStatus {
    SUCCESS(2000, "success", "连接成功"),
    ERROR(5000,"sys error", "系统繁忙"),
        CONTROLLER_ERROR(40001, "controller error", "控制层错误"),
    SERVICE_ERROR(40002,"service error", "服务层错误");
    private String msg;
    private int status;
    private String tip;

    private ErrorStatus(int status, String msg, String tip) {
        this.msg = msg;
        this.status = status;
        this.tip = tip;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
