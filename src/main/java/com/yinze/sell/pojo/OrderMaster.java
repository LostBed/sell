package com.yinze.sell.pojo;

import com.yinze.sell.enmus.OrderStatusEnmu;
import com.yinze.sell.enmus.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Yinze
 * @Created: 2018/6/25 10:12
 */

@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;
    
    private String buyerName;
    
    private String buyerPhone;
    
    private String buyerAddress;
    
    private String buyerOpenid;
    
    private BigDecimal orderAmount;
    
    private Integer orderStatus=OrderStatusEnmu.NEW.getCode();
    
    private Integer payStatus=PayStatusEnum.WAIT.getCode();
    
    private Date createTime;
    
    private Date updateTime;
}
