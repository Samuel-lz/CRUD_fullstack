package com.crudfullstack.crud_springboot_angular.service;

import com.crudfullstack.crud_springboot_angular.entity.Customer;
import com.crudfullstack.crud_springboot_angular.exception.ResourceNotFoundException;
import com.crudfullstack.crud_springboot_angular.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return  customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        Customer customer = customerRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Customer not found with id " + id);
                }
        );
//        return customerRepository.findById(id).get();
        return customer;
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }
}
