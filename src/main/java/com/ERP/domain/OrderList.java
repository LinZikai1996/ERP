package com.ERP.domain;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.io.Serializable;

@Component
public class OrderList implements Serializable {
    private String id;
    private String userId;
    private Integer total;
    private Integer rest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", total=" + total +
                ", rest=" + rest +
                '}';
    }
}
