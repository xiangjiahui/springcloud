package com.xjh.springcloud.controller;

import com.xjh.springcloud.service.MessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2022/1/20 18:15
 */
@RestController
public class SendMessageController {

    @Resource
    private MessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String send(){
        return messageProvider.sendMessage();
    }
}
