package com.qianfeng.hai.domain.entity;

import lombok.Data;

@Data
public class Member {
    /**
    * 会员id
    */
    private Integer memberId;

    /**
    * 会员等级
    */
    private String grade;

    /**
    * 会员权利
    */
    private String power;

    private Integer status;
}