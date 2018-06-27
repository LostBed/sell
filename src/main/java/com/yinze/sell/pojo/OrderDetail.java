package com.yinze.sell.pojo;

import lombok.Data;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: Yinze
 * @Created: 2018/6/25 13:20
 */
@Data
@Entity
public class OrderDetail {
    
    @Id
    private String detailId; 
    
    private String orderId;
    
    private String productId;
    
    private String productName;
    
    private BigDecimal productPrice;
    
    private Integer productQuantity;
    
    private String productIcon;
}
