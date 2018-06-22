package com.yinze.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:58
 */
@Data
public class ProductInfoVO {
    
    @JsonProperty("id")
    private String productId;
    
    @JsonProperty("name")
}
