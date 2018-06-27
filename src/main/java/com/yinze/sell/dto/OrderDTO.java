package com.yinze.sell.dto;

import com.yinze.sell.enmus.OrderStatusEnmu;
import com.yinze.sell.enmus.PayStatusEnum;
import com.yinze.sell.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Yinze
 * @Created: 2018/6/27 10:43
 */
@Data
public class OrderDTO {
    
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private Date createTime;

    private Date updateTime;
    
    private List<OrderDetail> orderDetailList;
}
