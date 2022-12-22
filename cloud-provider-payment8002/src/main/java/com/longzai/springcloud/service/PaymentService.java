package com.longzai.springcloud.service;

import com.longzai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @className: PaymentService
 * @description: TODO 类描述
 * @author: Jack.Myl
 * @date: 2022/12/16 4:55 PM
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
