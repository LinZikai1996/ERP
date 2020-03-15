package com.ERP.service;

import com.ERP.domain.Customer;

import java.util.List;

public interface CustomerService {
    boolean add(Customer customer);
    List<Customer> all();
}
