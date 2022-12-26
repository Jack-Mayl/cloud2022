package com.longzai.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className: ApplicationContextConfig
 * @description: 配置类
 * @author: Jack.Myl
 * @date: 2022/12/17 6:49 PM
 **/
@Configuration
public class ApplicationContextConfig {



    @Bean
    // 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
//    @LoadBalanced
    // 使用自己手写的轮询算法就要先取消这个
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
