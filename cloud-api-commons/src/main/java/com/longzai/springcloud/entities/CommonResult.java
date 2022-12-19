                                                                                                                                                                                                                                                                                                                                           package com.longzai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: CommonResult
 * @description: JSON封装体
 * @author: Jack.Myl
 * @date: 2022/12/16 4:36 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
