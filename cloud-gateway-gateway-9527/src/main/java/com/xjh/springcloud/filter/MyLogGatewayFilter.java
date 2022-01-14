package com.xjh.springcloud.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;


/**
 * @author xjh
 * @date 2022/1/14 17:01
 * Gateway自定义过滤器
 */
@Component
public class MyLogGatewayFilter implements GlobalFilter, Ordered {

    private static final Logger log = LoggerFactory.getLogger(MyLogGatewayFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        log.info("==========come in MyLogGatewayFilter: " + new Date());
        //检测请求体中要带有username信息
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null){
            log.info("用户名为NULL,非法用户,/(ㄒoㄒ)/~~");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 加载过滤器的顺序,数字越小,优先级越高
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
