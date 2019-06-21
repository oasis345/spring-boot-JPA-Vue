package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;


import org.springframework.stereotype.Repository;

/**
 * CustomerMapper
 */

@Repository
public interface CustomerMapper {
    
    public void insertCustomer(CustomerDTO customer);
    public List<CustomerDTO> selectCustomers();
    public List<CustomerDTO> selectCustomersByOption(String customer_Name);
    public CustomerDTO selectCustomerByCustomerId(String customer_Id);
    public void updateCustomer(CustomerDTO customer);
    public void deleteCustomer(String customer_Id);
    public CustomerDTO login(String customer_Id, String password);
    public int count();
    
}