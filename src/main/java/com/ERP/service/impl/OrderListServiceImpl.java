package com.ERP.service.impl;

import com.ERP.dao.OrderListDao;
import com.ERP.domain.OrderList;
import com.ERP.service.OrderListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "orderListService")
public class OrderListServiceImpl implements OrderListService {

    @Resource
    OrderListDao orderListDao;

    public List<OrderList> findOrderByCustomerName(String customerName) {
        return orderListDao.findOrderByCustomerName(customerName);
    }

    public List<OrderList> all() {
        return orderListDao.findAll();
    }

    public boolean add(OrderList orderList) {
        int result = orderListDao.add(orderList);
        return result == 1;
    }

    public boolean deleteById(Integer id) {
        int result = orderListDao.delete(id);
        return result == 1;
    }
}
