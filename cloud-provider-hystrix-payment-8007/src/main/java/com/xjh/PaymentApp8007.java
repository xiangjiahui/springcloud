package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2021/12/28 17:01
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentApp8007 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8007.class, args);
    }
}
