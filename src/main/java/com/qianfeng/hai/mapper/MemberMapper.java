package com.qianfeng.hai.mapper;

import com.qianfeng.hai.domain.entity.Member;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    int update(@Param("") Member member);
}