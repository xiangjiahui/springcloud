package com.xjh;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

/**
 * @author xjh
 * @date 2021/12/28 17:01
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker//该注解已过时,可以使用@EnableHystrix
@EnableHystrix
public class PaymentApp8007 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8007.class, args);
    }


    /**
     * 此配置是为了服务监控,与服务容错本身无关,springcloud升级后的坑
     * @return
     */
   @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);

        // 一启动就加载
        registrationBean.setLoadOnStartup(1);
        // 添加url
        registrationBean.addUrlMappings("/hystrix.stream");
        // 设置名称
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
