package com.yinze.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 17:55
 */
@Data
public class ProductVO {
    
    @JsonProperty("name")
    private String categoryName;
    
    @JsonProperty("type")
    private Integer categoryType;
    
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
