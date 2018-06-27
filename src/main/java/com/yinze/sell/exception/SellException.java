package com.yinze.sell.exception;

import com.yinze.sell.enmus.ResultEnum;

/**
 * @Author: Yinze
 * @Created: 2018/6/27 10:53
 */

public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
