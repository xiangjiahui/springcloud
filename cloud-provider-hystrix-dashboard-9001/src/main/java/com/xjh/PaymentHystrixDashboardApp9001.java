package com.xjh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author xjh
 * @date 2021/12/30 14:52
 */
@SpringBootApplication
@EnableHystrixDashboard
public class PaymentHystrixDashboardApp9001 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixDashboardApp9001.class, args);
    }


}
