package com.xjh.springcloud.user.service;



import com.xjh.springcloud.domains.User;

import java.util.List;

/**
 * @author xjh
 * @date 2021/12/23 15:51
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();

    /**
     * 新增用户信息
     * @param user
     * @return
     */
    int create(User user);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
