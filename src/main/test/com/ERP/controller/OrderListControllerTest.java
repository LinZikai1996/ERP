package com.ERP.controller;

import com.ERP.domain.Customer;
import com.ERP.domain.OrderList;
import com.ERP.service.OrderListService;
import com.ERP.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        List<OrderList> orderLists = orderListService.all();
        System.out.println(orderLists.size());
    }

    @Test
    public void addOrderList(){
        Customer customer = new Customer();
        customer.setId(1);
        OrderList orderList = new OrderList(customer,1000,1000, DateUtil.formatDate(new Date(System.currentTimeMillis()),"yyyy-MM-dd-hh:mm:ss"));
        System.out.println(orderListService.add(orderList));
    }

    @Test
    public void deleteOrderList(){
        System.out.println(orderListService.deleteById(2));
    }
}

