package com.xjh.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xjh
 * @date 2022/1/25 17:28
 */
@RestController
public class SentinelController {

    @GetMapping("/testA")
    public String test(){
        return "这是测试接口: testA";
    }


    /**
     * @param p1
     * @return
     * @SentinelResource注解
     * value值一般与rest地址相同
     * blockHandler值为兜底的方法
     */
    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey" ,blockHandler = "del_HotKey")
    public String testHotKey(@RequestParam(value = "p1" ,required = false)String p1){
        return "test HotKey";
    }

    public String del_HotKey(BlockException blockException){
        return "del_HotKey /(ㄒoㄒ)/~~";
    }
}
