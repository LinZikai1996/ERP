package com.ERP.controller;

import com.ERP.domain.Customer;
import com.ERP.service.CustomerService;
import com.ERP.service.OrderListService;
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

    @Resource
    private OrderListService orderListService;


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

    @RequestMapping("/findById")
    public ModelAndView findCustomerById(@RequestParam("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }

    @RequestMapping("/findByName")
    public ModelAndView findCustomerByName(@RequestParam("name") String name){
        ModelAndView modelAndView = new ModelAndView();
        Customer customer = customerService.findByName(name);
        customer.setOrderList(orderListService.findOrderByCustomerName(name));
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
}
