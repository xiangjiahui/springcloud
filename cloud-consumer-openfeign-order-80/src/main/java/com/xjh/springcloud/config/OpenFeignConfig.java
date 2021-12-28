package com.xjh.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xjh
 * @date 2021/12/28 14:38
 * 配置OpenFeign的日志打印级别
 */
@Configuration
public class OpenFeignConfig {

    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }
}
