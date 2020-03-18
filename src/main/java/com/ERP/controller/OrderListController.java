package com.ERP.controller;

import com.ERP.domain.Customer;
import com.ERP.domain.OrderList;
import com.ERP.service.OrderListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/orderList")
public class OrderListController {

    @Resource
    OrderListService orderListService;

    @RequestMapping("/findOrderByCustomerName")
    public ModelAndView findOrderByCustomerName(@RequestParam("customerName") String customerName){
        ModelAndView modelAndView = new ModelAndView("orderListManage");
        List<OrderList> orderLists = orderListService.findOrderByCustomerName(customerName);
        modelAndView.addObject("orderLists",orderLists);
        return modelAndView;
    }

    @RequestMapping("/findAll")
    public ModelAndView findAllOrderList(){
        ModelAndView modelAndView = new ModelAndView("orderListManage");
        List<OrderList> orderLists = orderListService.findAll();
        modelAndView.addObject("orderLists",orderLists);
        return modelAndView;
    }

    @RequestMapping("/add")
    public ModelAndView addOrderList(@RequestParam("orderList") OrderList orderList){
        ModelAndView modelAndView = new ModelAndView();
        boolean result = orderListService.add(orderList);
        if (result){
            modelAndView.addObject("information", "添加成功");
        } else {
            modelAndView.addObject("information", "添加失败");
        }
        return modelAndView;
    }

    @RequestMapping("/deleteOrderById")
    public ModelAndView deleteOrderList(@RequestParam("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        boolean result = orderListService.deleteById(id);
        if (result){
            modelAndView.addObject("information", "删除成功");
        } else {
            modelAndView.addObject("information", "删除失败");
        }
        return modelAndView;
    }

}
