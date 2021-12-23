package com.xjh.springcloud.user.service.impl;


import com.xjh.springcloud.user.domain.User;
import com.xjh.springcloud.user.mapper.UserMapper;
import com.xjh.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xjh
 * @date 2021/12/23 15:53
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.getUser();
    }
}
