package com.qianfeng.hai.mapper;

import com.qianfeng.hai.domain.entity.Build;

public interface BuildMapper {
    int deleteByPrimaryKey(Integer buildId);

    int insert(Build record);

    int insertSelective(Build record);

    Build selectByPrimaryKey(Integer buildId);

    int updateByPrimaryKeySelective(Build record);

    int updateByPrimaryKey(Build record);
}