package com.xjh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjh
 * @date 2022/1/23 15:07
 */
@RestController
public class NacosPaymentController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/payment/nacos/{id}")
    public String register(@PathVariable(name = "id")Integer id){
        return "register nacos,port:" + port + "\t id:" + id;
    }
}
