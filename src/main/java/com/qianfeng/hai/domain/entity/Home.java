package com.qianfeng.hai.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Home {
    /**
    * 房产id
    */
    private Integer homeId;

    /**
    * 房产所属小区
    */
    private String homeCommunity;

    /**
    * 房产所属楼栋
    */
    private String homeBuild;

    /**
    * 房产编号
    */
    private String homeNumbe;

    /**
    * 房产名称
    */
    private String homeName;

    /**
    * 户主名称
    */
    private String homeMaster;

    /**
    * 户主联系方式
    */
    private String homePhone;

    /**
    * 房间数
    */
    private Integer homeRoom;

    /**
    * 房间单元
    */
    private Integer homeUnit;

    /**
    * 所在楼层数
    */
    private Integer homeLayer;

    /**
    * 房产描述
    */
    private String homeDescribe;

    /**
    * 房产入住时间
    */
    private Date homeCreateTime;

    /**
    * 0为正常,1为已删除数据
    */
    private Integer homeIsDelete;
}