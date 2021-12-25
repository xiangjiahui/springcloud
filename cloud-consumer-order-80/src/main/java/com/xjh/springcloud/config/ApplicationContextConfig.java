package com.xjh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xjh
 * @date 2021/12/24 14:40
 */
@Configuration
public class ApplicationContextConfig {


    /**
     *使用@LoadBalanced注解赋予RestTemplate负载均衡功能
     */

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
