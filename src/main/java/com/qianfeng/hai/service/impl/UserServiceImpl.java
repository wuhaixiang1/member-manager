package com.qianfeng.hai.service.impl;

import com.qianfeng.hai.domain.dto.UserDto;
import com.qianfeng.hai.domain.entity.User;
import com.qianfeng.hai.mapper.UserMapper;
import com.qianfeng.hai.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> selectByKeyword(UserDto userDto, int page, int size) {
        int limit = (page - 1) * size;
        List<User> select = userMapper.select(userDto.getKeyword(), userDto.getEnterTime(), limit, size);
        return select;
    }


    public UserDto selectByUserId(UserDto userDto) {
        return null;
    }
}
