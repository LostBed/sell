package com.yinze.sell.enmus;

import lombok.Data;
import lombok.Getter;

/**
 * @Author: Yinze
 * @Created: 2018/6/27 10:54
 */

@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    
    PRODUCT_STOCK_ERROR(11,"库存不正确")
    ;
    
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
