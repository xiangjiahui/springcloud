package com.xjh.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xjh.springcloud.service.OpenHystrixConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2021/12/29 16:22
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_Fallback")
public class OrderHystrixController {

    @Resource
    private OpenHystrixConsumerService consumerService;


    @GetMapping("/user/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable(name = "id") Integer id){
        return consumerService.paymentInfo_OK(id);
    }


    /**
     * 全局服务降级配置使用@DefaultProperties(defaultFallback = "payment_Global_Fallback")
     * 如果只标注了@HystrixCommand注解,那么就找全局的降级处理方法。如果配置了特定的方法,那么就找自己特定的方法
     * @param id
     * @return
     */
    @GetMapping("/user/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
//    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable(name = "id") Integer id){
//        int age = 10/0;
        return consumerService.paymentInfo_Error(id);
    }


    public String paymentInfo_TimeOutHandler(Integer id){
        return "我是80客户消费端,对方系统系统繁忙或自己运行报错请检查自己。id:" + id + "\t" + "运行时间超过1.5秒/(ㄒoㄒ)/~~";
    }


    public String payment_Global_Fallback(){
        return "Global全局服务降级异常处理,请稍后再试！";
    }
}
