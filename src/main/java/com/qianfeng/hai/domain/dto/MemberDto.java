package com.qianfeng.hai.domain.dto;

import lombok.Data;

import java.math.BigInteger;
@Data
public class MemberDto {

    private Integer recordId;
    private String userName;
    private BigInteger integral;
    private BigInteger browse;
    private BigInteger shop;
    private Integer status;
}
