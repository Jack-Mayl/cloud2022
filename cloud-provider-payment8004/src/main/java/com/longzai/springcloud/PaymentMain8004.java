package com.longzai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: PaymentMain8004
 * @description: TODO 类描述
 * @author: Jack.Myl
 * @date: 2022/12/22 5:24 PM
 **/

@SpringBootApplication
// 该注解用于向使用consul或者zookeeper作为注册中心注册服务
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
