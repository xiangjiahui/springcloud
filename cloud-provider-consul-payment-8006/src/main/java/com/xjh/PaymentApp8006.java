package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xjh
 * @date 2021/12/26 12:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApp8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8006.class, args);
    }
}
