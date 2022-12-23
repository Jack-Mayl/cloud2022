package com.longzai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @className: PaymentController
 * @description: 启动类
 * @author: Jack.Myl
 * @date: 2022/12/23 2:51 PM
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springCloud with consul"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
