package com.xjh.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author xjh
 * @date 2021/12/26 12:25
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

    @RequestMapping ("/payment/consul")
    public String paymentConsul(){
        return "SpringCloud with Consul:" + serverPort + "\t" + UUID.randomUUID();
    }
}
