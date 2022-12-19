package com.longzai.springcloud.config;

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
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
