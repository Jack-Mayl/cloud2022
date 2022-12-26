package com.longzai.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @className: MySelfRule
 * @description: Ribbon负载规则替换
 * @author: Jack.Myl
 * @date: 2022/12/26 2:22 PM
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); // 定义随机
    }
}
