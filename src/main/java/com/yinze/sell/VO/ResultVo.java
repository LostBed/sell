package com.yinze.sell.VO;

import lombok.Data;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:47
 */
@Data
public class ResultVo<T> {
    /**错误码**/
    private Integer code;
    /**提示信息**/
    private String msg;
    /**具体内容**/
    private T data;
}
