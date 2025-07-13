package com.crudfullstack.crud_springboot_angular.service;

import com.crudfullstack.crud_springboot_angular.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(Integer id);
    void deleteById(Integer id);
    Customer update(Customer customer);
}

