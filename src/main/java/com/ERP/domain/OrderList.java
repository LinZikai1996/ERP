package com.ERP.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class OrderList implements Serializable {
    private Integer id;
    private Integer customerId;
    private Integer total;
    private Integer remain;

    public OrderList() {
    }

    public OrderList(Integer customerId, Integer total, Integer remain) {
        this.customerId = customerId;
        this.total = total;
        this.remain = remain;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return customerId;
    }

    public void setUserId(Integer userId) {
        this.customerId = userId;
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

    @Override
    public String toString() {
        return "OrderList{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", total=" + total +
                ", remain=" + remain +
                '}';
    }
}
