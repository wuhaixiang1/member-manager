package com.qianfeng.hai.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Community {
    /**
    * 小区id
    */
    private Integer communityId;

    /**
    * 小区名称
    */
    private String communityName;

    /**
    * 小区地址
    */
    private String communityAddress;

    /**
    * 小区占地面积
    */
    private Long communityArea;

    /**
    * 小区栋数
    */
    private Integer communityBuild;

    /**
    * 小区总户数
    */
    private Integer communityHome;

    /**
    * 小区绿化
    */
    private Integer communityGreening;

    /**
    * 小区缩略图
    */
    private String communityIcon;

    /**
    * 开发商
    */
    private String communityDevelopers;

    /**
    * 物业公司
    */
    private String communityCompany;

    /**
    * 小区创建时间
    */
    private Date communityCreatEtime;

    /**
    * 小区状态0表示正常显示,1表示停用
    */
    private Integer communityStatus;

    /**
    * 0为正常,1为已删除数据
    */
    private Integer communityIsDelete;
}