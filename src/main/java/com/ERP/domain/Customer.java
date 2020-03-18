package com.ERP.domain;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {
    private Integer id;
    private String name;
    private List<OrderList> orderList;

    public Customer() {
    }

    public Customer(Integer id, String name, List<OrderList> orderList) {
        this.id = id;
        this.name = name;
        this.orderList = orderList;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderList> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderList> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}

