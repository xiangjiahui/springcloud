package com.xjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xjh
 * @date 2022/1/15 16:33
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp3344.class, args);
    }
}
