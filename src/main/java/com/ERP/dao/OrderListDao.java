package com.ERP.dao;

import com.ERP.domain.OrderList;

import java.util.List;

public interface OrderListDao extends GenericDao<OrderList,Integer> {

    List<OrderList> findOrderByCustomerName(String name);
}
