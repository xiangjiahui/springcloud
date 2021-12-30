package com.xjh.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author xjh
 * @date 2021/12/30 12:
 * 该类实现@FeignClient标注的接口,用于通配服务降级,在@FeignClient标注的接口上,fallback属性赋值该实现类
 */
@Component
public class PaymentHystrixFallbackServiceImpl implements OpenHystrixConsumerService{
    @Override
    public String paymentInfo_Error(Integer id) {
        return "PaymentHystrixFallbackService fall back paymentInfo_Error, /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixFallbackService fall back paymentInfo_OK, /(ㄒoㄒ)/~~";
    }
}
