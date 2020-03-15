package com.ERP.service.impl;

import com.ERP.dao.CustomerDao;
import com.ERP.domain.Customer;
import com.ERP.service.CustomerService;
import org.springframework.stereotype.Service;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public boolean add(Customer customer) {
        int result = customerDao.add(customer);
        return result == 1;
    }
}
