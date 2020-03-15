package com.ERP.service.impl;

import com.ERP.dao.CustomerDao;
import com.ERP.domain.Customer;
import com.ERP.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    public boolean add(Customer customer) {
        int result = customerDao.add(customer);
        return result == 1;
    }

    public List<Customer> all() {
        return customerDao.findAll();
    }
}
