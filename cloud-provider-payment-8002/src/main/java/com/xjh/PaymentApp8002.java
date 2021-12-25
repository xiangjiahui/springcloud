package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2021/12/23 15:07
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApp8002 {

    public static void main(String[] args) {
            SpringApplication.run(PaymentApp8002.class,args);
    }
}
