package com.ERP.controller;

import com.ERP.domain.Customer;
import com.ERP.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/add")
    public ModelAndView addCustomer(@RequestParam("customer") Customer customer){
        ModelAndView modelAndView = new ModelAndView();
        customerService.add(customer);
        return modelAndView;
    }
}
