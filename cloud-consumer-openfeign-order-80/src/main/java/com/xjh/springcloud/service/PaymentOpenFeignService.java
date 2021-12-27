package com.xjh.springcloud.service;


import com.xjh.springcloud.domains.CommonResult;
import com.xjh.springcloud.domains.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 123
 */
@Component
@FeignClient(name = "CLOUD-PAYMENT-SERVICE")
public interface PaymentOpenFeignService {

    /**
     * 获得所有用户信息
     * 这里的方法的路径跟微服务服务提供者的路径一致
     * @return
     */
    @GetMapping("user/getAllUser")
    CommonResult getAllUser();


    /**
     * 根据id获得用户信息
     * @param id
     * @return
     */
    @GetMapping("user/getUser/{id}")
    CommonResult<User> getUserById(@PathVariable(name = "id") Integer id);
}
