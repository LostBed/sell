package com.yinze.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:58
 */
@Data
public class ProductInfoVO {
    
    @JsonProperty("id")
    private String productId;
    
    @JsonProperty("name")
    private  String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
