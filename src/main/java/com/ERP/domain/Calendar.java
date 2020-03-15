package com.ERP.domain;

import com.mysql.fabric.xmlrpc.base.Data;

import java.util.Date;
import java.util.List;

public class Calendar {
    private Integer id;
    private Data date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }
}
