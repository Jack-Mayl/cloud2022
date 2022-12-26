package com.longzai.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @className: LoadBalancer
 * @description: 手写Ribbon轮询算法
 * @author: Jack.Myl
 * @date: 2022/12/26 3:57 PM
 **/
public interface LoadBalancer  {
    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
