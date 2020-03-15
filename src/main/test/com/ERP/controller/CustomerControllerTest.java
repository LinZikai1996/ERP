package com.ERP.controller;

import com.ERP.domain.Customer;
import com.ERP.service.CustomerService;
import com.ERP.service.impl.CustomerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CustomerControllerTest {

    @Resource
    CustomerService customerService;

    @Test
    public void addCustomer() {
    }

    @Test
    public void listCustomer() {
        List<Customer> customerList = customerService.all();
        System.out.println(customerList);
    }
}