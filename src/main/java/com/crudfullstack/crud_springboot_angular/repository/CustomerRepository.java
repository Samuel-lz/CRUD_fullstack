package com.crudfullstack.crud_springboot_angular.repository;
import com.crudfullstack.crud_springboot_angular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {

}
