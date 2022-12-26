package com.longzai.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className: MyLB
 * @description: 手写Ribbon轮询算法
 * @author: Jack.Myl
 * @date: 2022/12/26 3:59 PM
 **/
@Component
public class MyLB implements  LoadBalancer{

//    原子类
    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问,次数next:"+next);
        return next;
    }

//    负载均衡算法： rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标 每次服务重启后rest接口技术从1开始
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement() %  serviceInstanceList.size();

        return serviceInstanceList.get(index);
    }
}
