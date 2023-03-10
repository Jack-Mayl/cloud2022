package com.longzai.springcloud;

import com.longzai.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @className: OrderMain80
 * @description: 启动类
 * @author: Jack.Myl
 * @date: 2022/12/16 9:17 PM
 **/
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
