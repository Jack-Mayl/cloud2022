package com.longzai.springcloud;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @className: PaymentMain8001
 * @description: 启动类
 * @author: Jack.Myl
 * @date: 2022/12/16 4:22 PM
 **/
@SpringBootApplication
@MapperScan("com.longzai.springcloud.dao")
@ConfigurationPropertiesScan("com.longzai.springcloud")
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
