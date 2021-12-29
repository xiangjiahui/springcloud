package com.xjh.springcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.xjh.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xjh
 * @date 2021/12/29 13:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    /**
     * Hystrix服务测试正确方法
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_OK,id:" + id + "\t" + "正确方法测试成功";
    }


    /**
     * Hystrix服务测试方法,使其运行超时,触发Hystrix,不过一般Hystrix服务都是用在客户端
     * 使用@HystrixCommand注解来做服务降级处理
     * fallbackMethod 方法,如果方法运行超时或出错,就由该方法标注的方法来处理问题
     * commandProperties 设置处理时间峰值,超过这个峰值就报错,由兜底的方法来处理,这里的时间峰值设置为3
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_ErrorHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    @Override
    public String paymentInfo_Error(Integer id) {

        int time = 1;

        //int age = 10/0; 这种情况属于代码业务逻辑出现问题,同样是去找兜底的方法来处理问题

        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id:" + id + "\t" + "耗时(秒):" + time;
    }


    /**
     * 兜底的方法,一旦其他的方法处理出现了问题,比如超时或业务逻辑出错,就由该方法来处理问题,
     * 可以及时的给客户端消费者返回一个出错的信息,让客户端不再一直等待访问,以此来减少客户端的访问,这就是Hystrix的服务降级的处理方法
     * @param id
     * @return
     */
    public String paymentInfo_ErrorHandler(Integer id){
        return "线程池:" + Thread.currentThread().getName() + "系统繁忙或运行报错,请您稍后再试。id:" + id + "\t" + "运行时间超过3秒/(ㄒoㄒ)/~~";
    }
}
