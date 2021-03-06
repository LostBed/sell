package com.yinze.sell.enmus;

import lombok.Getter;

/**
 * @Author: Yinze
 * @Created: 2018/6/25 13:17
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
