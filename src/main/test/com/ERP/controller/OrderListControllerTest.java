package com.ERP.controller;

import com.ERP.domain.OrderList;
import com.ERP.service.OrderListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class OrderListControllerTest {

    @Resource
    OrderListService orderListService;

    @Test
    public void findOrderByCustomerName() {
        System.out.println(orderListService.findOrderByCustomerName("Lin"));
    }

    @Test
    public void findOrderList() {
        System.out.println(orderListService.findAll());
    }

    @Test
    public void addOrderList(){
        OrderList orderList = new OrderList(1,100000,10000);
        System.out.println(orderListService.add(orderList));
    }

    @Test
    public void deleteOrderList(){
        System.out.println(orderListService.deleteById(2));
    }
}

