package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2021/12/24 14:27
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApp80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApp80.class,args);
    }
}
