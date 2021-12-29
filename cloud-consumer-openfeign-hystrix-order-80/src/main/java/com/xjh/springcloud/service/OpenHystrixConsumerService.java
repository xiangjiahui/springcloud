package com.xjh.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xjh
 * @date 2021/12/29 16:19
 */
@Component
@FeignClient(name = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface OpenHystrixConsumerService {

    @GetMapping("/user/hystrix/timeout/{id}")
    String paymentInfo_Error(@PathVariable(name = "id") Integer id);
}
