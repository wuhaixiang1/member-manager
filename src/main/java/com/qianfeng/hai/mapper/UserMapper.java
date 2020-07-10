package com.qianfeng.hai.mapper;

import com.qianfeng.hai.domain.entity.User;import org.apache.ibatis.annotations.Param;import java.util.List;

public interface UserMapper {

    //选择名字或电话或邮箱都可查询到用户信息
    List<User> select(@Param("keyword") String keyword, @Param("date") String date, @Param("limit") int limit, @Param("offset") int offset);

    int update(@Param("user") User user);

    User selectById(@Param("id") int id);

    int delete(@Param("list") List<User> list);

    int insert(@Param("user") User user);

}