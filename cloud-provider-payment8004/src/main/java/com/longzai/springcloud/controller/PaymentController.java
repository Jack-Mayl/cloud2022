package com.longzai.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @className: PaymentController
 * @description: Controller层
 * @author: Jack.Myl
 * @date: 2022/12/22 5:26 PM
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentZK(){
        return "springCloud with zookeeper"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
