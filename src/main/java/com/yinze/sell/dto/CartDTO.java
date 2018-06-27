package com.yinze.sell.dto;

import lombok.Data;

/**
 * @Author: Yinze
 * @Created: 2018/6/27 13:33
 */
@Data
public class CartDTO {
    private String productId;
    
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
