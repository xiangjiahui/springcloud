package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xjh
 * @date 2021/12/27 15:29
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignApp80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApp80.class, args);
    }
}
