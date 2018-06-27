package com.yinze.sell.dao;

import com.yinze.sell.pojo.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: Yinze
 * @Created: 2018/6/27 10:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;
    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345678912");
        orderDetail.setOrderId("111111112");
        orderDetail.setProductIcon("http://xxxx/jps");
        orderDetail.setProductId("11111132");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);
        OrderDetail result = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(result);
    }
    
    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList=orderDetailDao.findByOrderId("111111112");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}