package com.qianfeng.hai.controller;

import com.qianfeng.hai.domain.dto.CommunityDto;
import com.qianfeng.hai.utils.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CommunityController {
    /**
     *  查询小区,小区创建时间按照在两个日期之间,再按照小区名模糊查询出小区集合
     *
     * @param communityDto 封装了小区创建的起始日期, 截止日期, 小区的名字
     * @param page 结果集的页数
     * @param size 每页有多少条数据
     * @return
     */
    @PostMapping("/selectByDate")
    public Result<CommunityDto> selectByDate(CommunityDto communityDto, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int size) {
        return null;
    }

    /**
     * 删除一条数据,保证删除一条数据后该页面的数据条数不变
     *
     * @param communityId 通过小区的id删除数据
     * @param page 当前页数
     * @param size 一页中的条数
     * @return
     */
    @PostMapping("/deleteOne")
    public Result<CommunityDto> deleteOne(int communityId, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int size) {
        return null;
    }

    /**
     * 批量删除当前页面中的记录,保证当前页面记录条数不变
     *
     * @param communityDto 把所有数据的id封装进集合
     * @param page 当前页数
     * @param size 一页中的条数
     * @return
     */
    @PostMapping("/deleteBatch")
    public Result<CommunityDto> deleteOne(List<CommunityDto> communityDto, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int size) {
        return null;
    }


}
