package com.bitcamp.web.servicelmpl;

import java.util.List;


import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
       
    @Autowired
    CustomerDTO customer;


    @Override
    public void addCustomer(CustomerDTO customer) {
        
    }

    @Override
    public List<CustomerDTO> findCustomers() {
            return null;

    }

    @Override
    public List<CustomerDTO> findCustomersByOption(String customerName) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {
      
       
    }
    @Override
    public void deleteCustomer(String customer_Id) {
      
    }

    
    @Override
    public CustomerDTO login(String customerId, String password) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

  


}