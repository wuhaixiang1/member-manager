package com.qianfeng.hai.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    /**
     * 成员id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 性别
     */
    private String gender;

    /**
     * 加入时间
     */
    private String enterTime;

    /**
     * 等级
     */
    private String grade;

    /**
     * 状态
     */
    private String status;
}