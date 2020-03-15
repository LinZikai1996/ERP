package com.ERP.controller;

import com.ERP.domain.Customer;
import com.ERP.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping("/add")
    public ModelAndView addCustomer(@RequestParam("customer") Customer customer){
        ModelAndView modelAndView = new ModelAndView();
        boolean result = customerService.add(customer);
        if (result){
            modelAndView.addObject("information", "添加成功");
        } else {
            modelAndView.addObject("information", "添加失败");
        }
        return modelAndView;
    }

    @RequestMapping("/list")
    public ModelAndView listCustomer(){
        ModelAndView modelAndView = new ModelAndView("customerManage");
        List<Customer> customerList = customerService.all();
        modelAndView.addObject("customerList",customerList);
        return modelAndView;
    }
}
