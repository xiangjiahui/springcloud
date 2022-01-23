package com.xjh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2022/1/23 15:07
 */
@RestController
public class NacosConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-uri.nacos-user-service}")
    private String serverURL;


    @GetMapping("/consumer/nacos/{id}")
    public String register(@PathVariable(name = "id")Integer id){
        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id,String.class);
    }
}
