package com.yinze.sell.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: Yinze
 * @Created: 2018/6/22 16:58
 */

@Entity
@Data
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;
    
    private String productName;
    
    private BigDecimal productPrice;
    
    private Integer productStock;
    
    private String productDescription;
    
    private String productIcon;
    /** 0正常1下架**/
    private Integer productStatus;
    
    private Integer categoryType; 
}
