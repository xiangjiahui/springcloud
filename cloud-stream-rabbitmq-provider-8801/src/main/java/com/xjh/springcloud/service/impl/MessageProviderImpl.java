package com.xjh.springcloud.service.impl;

import cn.hutool.core.lang.UUID;
import com.xjh.springcloud.service.MessageProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

/**
 * @author xjh
 * @date 2022/1/20 17:31
 * 定义消息的推送管道
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements MessageProvider {

    private final Logger logger = LoggerFactory.getLogger(MessageProviderImpl.class);

    @Resource
    private MessageChannel output;

    @Value("${server.port}")
    private String port;

    @Override
    public String sendMessage() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        logger.info("端口:" + port + "发送的消息:" + serial);
        return serial;
    }
}
