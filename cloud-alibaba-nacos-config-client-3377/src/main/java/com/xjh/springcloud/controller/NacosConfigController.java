package com.xjh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjh
 * @date 2022/1/23 16:26
 * @RefreshScope   支持Nacos的动态刷新功能
 */
@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
