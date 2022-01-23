package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xjh
 * @date 2022/1/23 15:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApp90 {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApp90.class, args);
    }
}
