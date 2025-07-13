package com.crudfullstack.crud_springboot_angular.controller;
import com.crudfullstack.crud_springboot_angular.entity.Customer;
import com.crudfullstack.crud_springboot_angular.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}