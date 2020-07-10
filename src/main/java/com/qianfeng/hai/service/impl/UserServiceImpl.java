package com.qianfeng.hai.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.qianfeng.hai.domain.dto.UserDto;
import com.qianfeng.hai.domain.entity.Member;
import com.qianfeng.hai.domain.entity.User;
import com.qianfeng.hai.exception.ControllerException;
import com.qianfeng.hai.mapper.MemberMapper;
import com.qianfeng.hai.mapper.UserMapper;
import com.qianfeng.hai.service.UserService;
import com.qianfeng.hai.utils.ErrorStatus;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Resource
    MemberMapper memberMapper;

    @Override
    public List<User> selectByKeyword(UserDto userDto, int page, int size) {
        int limit = (page - 1) * size;
        List<User> select = userMapper.select(userDto.getKeyword(), userDto.getEnterTime(), limit, size);
        return select;
    }

    @Transactional
    public UserDto updateByUserId(UserDto userDto) throws ControllerException {
        UserDto userDto1 = null;
        try {
            User user = new User();
            Member member = new Member();
            BeanUtils.copyProperties(userDto, user);
            BeanUtils.copyProperties(userDto.getMemberDto(), member);
            memberMapper.update(member);
            userMapper.update(user);
            Member member1 = memberMapper.selectById(user.getUserId());
            User user1 = userMapper.selectById(member.getMemberId());
            userDto1 = new UserDto();
            BeanUtils.copyProperties(user1, userDto1);
            BeanUtils.copyProperties(member1, userDto1.getMemberDto());
        } catch (BeansException e) {
           throw new ControllerException(ErrorStatus.CONTROLLER_ERROR);
        }
        return userDto1;
    }

    @Override
    public int deleteByBatch(List<User> list) {
        return 0;
    }

    @Override
    public int insert(UserDto userDto) {
        return 0;
    }
}
