package com.ijse.gdse.deploy_project.service;

import com.ijse.gdse.deploy_project.entity.Customer;
import com.ijse.gdse.deploy_project.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getCustomer() {
        return customerRepo.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}
