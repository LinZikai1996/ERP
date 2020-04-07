package com.ERP.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;;

@Component
public class OrderList implements Serializable {
    private Integer id;
    private Customer customer;
    private Integer total;
    private Integer remain;
    private String date;

    public OrderList() {
    }

    public OrderList(Customer customer, Integer total, Integer remain, String date) {
        this.customer = customer;
        this.total = total;
        this.remain = remain;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", customer=" + customer +
                ", total=" + total +
                ", remain=" + remain +
                ", date=" + date +
                '}';
    }
}
