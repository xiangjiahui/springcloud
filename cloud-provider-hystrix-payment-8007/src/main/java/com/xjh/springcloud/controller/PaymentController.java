package com.xjh.springcloud.controller;

import com.xjh.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2021/12/29 13:14
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/user/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable(name = "id") Integer id) {
        String result = paymentService.paymentInfo_OK(id);
        log.info("=====" + result + "=====");
        return result;
    }

    @GetMapping("/user/hystrix/timeout/{id}")
    public String paymentInfo_Error(@PathVariable(name = "id") Integer id){
        String result = paymentService.paymentInfo_Error(id);
        log.info("=====" + result + "=====");
        return result;
    }
}
