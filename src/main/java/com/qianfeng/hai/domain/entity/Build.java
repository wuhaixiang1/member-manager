package com.qianfeng.hai.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Build {
    /**
    * 栋数id
    */
    private Integer buildId;

    /**
    * 栋数所属小区
    */
    private String buildCommunity;

    /**
    * 栋数编号
    */
    private String buildNumber;

    /**
    * 栋数名称
    */
    private String bulidName;

    /**
    * 该栋用户数
    */
    private Integer buildHome;

    /**
    * 该栋描述
    */
    private String buildDescribe;

    /**
    * 该栋创建时间
    */
    private Date buildCreateTime;

    /**
    * 0为正常,1为已删除数据
    */
    private Integer buildIsDelete;
}