package com.xjh.springcloud.user.mapper;

import com.xjh.springcloud.domains.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xjh
 * @date 2021/12/23 15:54
 */
@Mapper
public interface UserMapper {

    /**
     * 获得用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 增加用户
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
