package com.xjh.springcloud.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xjh
 * @date 2021/12/23 19:54
 * 统一json串返回结果封装类
 */
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
