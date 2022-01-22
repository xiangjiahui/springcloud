package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2022/1/20 17:28
 * 该模块作为消息的生产者模块
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamApp8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamApp8801.class, args);
    }
}
