package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2022/1/11 14:06
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayApp9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp9527.class, args);
    }
}
