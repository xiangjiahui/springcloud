package com.xjh.springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xjh
 * @date 2021/12/29 12:58
 */
public interface PaymentService {

    /**
     * Hystrix服务测试方法
     * @param id
     * @return
     */
    String paymentInfo_OK(Integer id);

    /**
     *Hystrix服务测试方法
     * @param id
     * @return
     */
    String paymentInfo_Error(Integer id);

    /**
     * 服务熔断测试方法
     * @param id
     * @return
     */
   String paymentCircuitBreaker(Integer id);
}
