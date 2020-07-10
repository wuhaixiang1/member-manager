package com.qianfeng.hai.domain.entity;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Record {
    /**
    * 记录id
    */
    private Integer recordId;

    /**
    * 用户名
    */
    private String userName;

    /**
    * 积分
    */
    private BigInteger integral;

    /**
    * 浏览条
    */
    private BigInteger browse;

    /**
    * 购物币
    */
    private BigInteger shop;

    private Integer status;
}