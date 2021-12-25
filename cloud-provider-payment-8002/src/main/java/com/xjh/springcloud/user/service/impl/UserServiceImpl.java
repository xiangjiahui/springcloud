package com.xjh.springcloud.user.service.impl;


import com.xjh.springcloud.domains.User;
import com.xjh.springcloud.user.mapper.UserMapper;
import com.xjh.springcloud.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xjh
 * @date 2021/12/23 15:53
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public int create(User user) {
        return userMapper.create(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
}
