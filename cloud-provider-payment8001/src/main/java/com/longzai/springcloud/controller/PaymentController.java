package com.longzai.springcloud.controller;

import com.longzai.springcloud.entities.CommonResult;
import com.longzai.springcloud.entities.Payment;
import com.longzai.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className: PaymentController
 * @description: controller
 * @author: Jack.Myl
 * @date: 2022/12/16 5:00 PM
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("***插入结果:"+i);
        if(i>0){
            return new CommonResult(200,"插入数据库成功,serverPort"+serverPort,i);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("***插入结果:"+paymentById);
        if(paymentById!=null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,paymentById);
        }else {
            return new CommonResult(444,"没有对呀记录,查询id"+id,null);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("******element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            /**
             * getServiceId() 获得服务端id
             * getHost()  获得host
             * getPort()  获得端口
             * getUri()   获得uri
             */
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymenLB(){
        return serverPort;
    }
}
