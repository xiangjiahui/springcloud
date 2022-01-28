package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xjh
 * @date 2022/1/25 16:16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceApp8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApp8401.class, args);
    }
}
