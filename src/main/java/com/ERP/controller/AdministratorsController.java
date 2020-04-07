package com.ERP.controller;

import com.ERP.domain.Administrators;
import com.ERP.domain.Customer;
import com.ERP.domain.OrderList;
import com.ERP.service.AdministratorsService;
import com.ERP.service.CustomerService;
import com.ERP.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/administrator")
@SessionAttributes("administrators")
public class AdministratorsController {

    @Resource
    private AdministratorsService administratorsService;

    @Resource
    private OrderListService orderListService;

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam("administratorName") String administratorName, @RequestParam("password") String password, HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        Administrators administrators = administratorsService.login(administratorName, password);
        if (administrators != null){
            modelAndView.setViewName("orderListManage");
            List<OrderList> orderLists = orderListService.all();
            modelAndView.addObject("orderLists",orderLists);
            modelAndView.addObject("administrators", administrators);
        } else {
            modelAndView.setViewName("../index");
            modelAndView.addObject("error", "用户不存在");
        }
        return modelAndView;

    }
}
