package com.xjh.springcloud.controller;

import com.xjh.springcloud.domains.CommonResult;
import com.xjh.springcloud.service.PaymentOpenFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2021/12/27 15:43
 */
@RestController
public class ConsumerOpenFeignController {

    @Resource
    private PaymentOpenFeignService paymentOpenFeignService;

    @GetMapping("/openfeign/user/getUser/{id}")
    public CommonResult getByUserId(@PathVariable(name = "id") Integer id){
        return paymentOpenFeignService.getUserById(id);
    }

    @GetMapping("/openfeign/user/getAllUser")
    public CommonResult list(){
        return paymentOpenFeignService.getAllUser();
    }


    @GetMapping("/openfeign/user/openfeign/timeout")
    public String userOpenFeignTimeout(){
        return paymentOpenFeignService.userOpenFeignTimeout();
    }
}
