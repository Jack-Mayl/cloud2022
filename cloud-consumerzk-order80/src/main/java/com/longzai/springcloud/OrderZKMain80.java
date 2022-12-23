package com.longzai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: OrderZKMain80
 * @description: TODO 类描述
 * @author: Jack.Myl
 * @date: 2022/12/23 2:07 PM
 **/
@SpringBootApplication
// 该注解用于向使用consul或者zookeeper作为注册中心注册服务
@EnableDiscoveryClient
public class OrderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class,args);
    }
}
