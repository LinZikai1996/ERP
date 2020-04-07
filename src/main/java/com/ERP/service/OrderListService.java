package com.ERP.service;

import com.ERP.domain.OrderList;

import java.util.List;

public interface OrderListService {

    List<OrderList> findOrderByCustomerName(String customer);

    List<OrderList> all();

    boolean add(OrderList orderList);

    boolean deleteById(Integer id);
}
