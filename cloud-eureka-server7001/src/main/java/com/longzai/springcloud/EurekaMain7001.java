package com.longzai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @className: EurekaMain7001
 * @description: Eureka主启动
 * @author: Jack.Myl
 * @date: 2022/12/19 3:46 PM
 **/
@SpringBootApplication
// 这里表示是Eureka的注册中心
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
