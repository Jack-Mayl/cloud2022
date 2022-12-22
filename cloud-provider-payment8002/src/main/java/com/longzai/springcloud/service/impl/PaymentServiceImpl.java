package com.longzai.springcloud.service.impl;

import com.longzai.springcloud.dao.PaymentDao;
import com.longzai.springcloud.entities.Payment;
import com.longzai.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className: PaymentService
 * @description: Service层实现类
 * @author: Jack.Myl
 * @date: 2022/12/16 4:55 PM
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
