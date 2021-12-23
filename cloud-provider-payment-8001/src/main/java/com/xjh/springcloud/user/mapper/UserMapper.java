package com.xjh.springcloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xjh.springcloud.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

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
    User getUser();
}
