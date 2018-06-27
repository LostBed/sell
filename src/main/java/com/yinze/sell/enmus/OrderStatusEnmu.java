package com.yinze.sell.enmus;

import lombok.Getter;

/**
 * @Author: Yinze
 * @Created: 2018/6/25 13:14
 */
@Getter
public enum OrderStatusEnmu {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;
    
    private Integer code;
    private String message;

    OrderStatusEnmu(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
