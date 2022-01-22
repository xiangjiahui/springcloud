package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2022/1/20 18:23
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamApp8802 {

    public static void main(String[] args) {
        SpringApplication.run(StreamApp8802.class, args);
    }
}
