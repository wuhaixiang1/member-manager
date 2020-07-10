package com.qianfeng.hai.controller;

import com.qianfeng.hai.domain.dto.UserDto;
import com.qianfeng.hai.domain.entity.User;
import com.qianfeng.hai.exception.ControllerException;
import com.qianfeng.hai.mapper.UserMapper;
import com.qianfeng.hai.service.UserService;
import com.qianfeng.hai.utils.ErrorStatus;
import com.qianfeng.hai.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserManagerController {
    @Resource
    UserService userService;

    @PostMapping("/keyword")
    public Result<List<User>> selectByKeyword(UserDto userDto, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        List<User> users = userService.selectByKeyword(userDto, page, size);
        return Result.success(users);
    }
    @PostMapping("/update")
    public Result<UserDto> updateByUserId(UserDto userDto) throws ControllerException {
        UserDto userDto1 = userService.updateByUserId(userDto);
        return Result.success(userDto1);
    }
    @PostMapping("/delete")
    public Result<Integer> deleteBatch(List<User> user) {
        return null;
    }

    @PostMapping("/insert")
    public Result<Integer> addUser(UserDto userDto) {
        return null;
    }





    @PostMapping("/update")
    public Result<UserDto> updateByUserId33(UserDto userDto) throws ControllerException {
        UserDto userDto1 = userService.updateByUserId(userDto);
        return Result.success(userDto1);
    }
}
