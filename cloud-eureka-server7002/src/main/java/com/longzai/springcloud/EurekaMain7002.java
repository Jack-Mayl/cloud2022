package com.longzai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @className: EurekaMain7002
 * @description: TODO 类描述
 * @author: Jack.Myl
 * @date: 2022/12/20 5:18 PM
 **/
@SpringBootApplication
// 这里表示是Eureka的注册中心
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}