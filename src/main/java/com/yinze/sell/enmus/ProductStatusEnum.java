package com.yinze.sell.enmus;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:27
 */
@Getter
public enum ProductStatusEnum {
    
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message=message;
    }
}
