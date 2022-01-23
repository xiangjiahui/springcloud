package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xjh
 * @date 2022/1/23 16:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientApp3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientApp3377.class, args);
    }
}
