package com.longzai.springcloud.dao;

import com.longzai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @className: PaymentDao
 * @description: DAO层
 * @author: Jack.Myl
 * @date: 2022/12/16 4:40 PM
 **/
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
