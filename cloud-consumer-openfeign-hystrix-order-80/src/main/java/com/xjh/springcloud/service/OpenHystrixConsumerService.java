package com.xjh.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xjh
 * @date 2021/12/29 16:19
 * 参数name指向调用的微服务提供者的微服务名称
 */
@Component
@FeignClient(name = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentHystrixFallbackServiceImpl.class)
public interface OpenHystrixConsumerService {

    @GetMapping("/user/hystrix/timeout/{id}")
    String paymentInfo_Error(@PathVariable(name = "id") Integer id);

    @GetMapping("/user/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable(name = "id") Integer id);
}
