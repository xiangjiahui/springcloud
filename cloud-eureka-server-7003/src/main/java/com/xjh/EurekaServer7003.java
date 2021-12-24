package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xjh
 * @date 2021/12/24 16:47
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003.class, args);
    }
}
