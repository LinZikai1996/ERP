package com.ERP.controller;

import com.ERP.domain.Administrators;
import com.ERP.service.AdministratorsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AdministratorsControllerTest {

    @Resource
    AdministratorsService administratorsService;

    @Test
    public void login() {
        Administrators administrators = administratorsService.login("Lin", "123");
        System.out.println(administrators);
    }
}