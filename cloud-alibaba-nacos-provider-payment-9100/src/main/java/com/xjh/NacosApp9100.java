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
public class NacosApp9100 {

    public static void main(String[] args) {
        SpringApplication.run(NacosApp9100.class, args);
    }
}
