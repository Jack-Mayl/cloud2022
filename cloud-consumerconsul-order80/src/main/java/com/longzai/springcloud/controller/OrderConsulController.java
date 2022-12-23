package com.longzai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @className: OrderConsulController
 * @description: Consul控制层
 * @author: Jack.Myl
 * @date: 2022/12/23 7:19 PM
 **/
@RestController
@Slf4j

public class OrderConsulController {

    public  static final String INVOKE_URL="http://cloud-providerconsul-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return  result;
    }
}
