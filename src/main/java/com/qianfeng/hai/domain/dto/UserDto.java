package com.qianfeng.hai.domain.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserDto {
    private Integer userId;
    private String userName;
    private String phone;
    private String email;
    private String address;
    private String gender;
    private String enterTime;
    private String grade;
    private String status;
    private MemberDto memberDto;
    private String Keyword;
}
