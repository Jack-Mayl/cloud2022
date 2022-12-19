package com.longzai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @className: Payment
 * @description: Payment的实体类
 * @author: Jack.Myl
 * @date: 2022/12/16 4:34 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
