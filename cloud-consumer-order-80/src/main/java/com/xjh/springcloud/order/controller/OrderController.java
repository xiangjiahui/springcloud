package com.xjh.springcloud.order.controller;


import com.xjh.springcloud.domains.CommonResult;
import com.xjh.springcloud.domains.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2021/12/24 14:41
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    public static final String USER_URL_PREFIX = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 微服务消费者接口都是GET请求
     *
     * @param id
     * @return
     */
    @GetMapping("/user/getUser/{id}")
    public CommonResult<User> getUserById(@PathVariable(name = "id") Integer id) {

        return restTemplate.getForObject(USER_URL_PREFIX + "/user/getUser/" + id, CommonResult.class);
    }

    @GetMapping("/user/create")
    public CommonResult<User> create(User user) {

        return restTemplate.postForObject(USER_URL_PREFIX + "/user/create",user,CommonResult.class);
    }
}
