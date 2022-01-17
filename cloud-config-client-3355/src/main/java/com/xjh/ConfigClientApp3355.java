package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xjh
 * @date 2022/1/17 13:04
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApp3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp3355.class, args);
    }
}
