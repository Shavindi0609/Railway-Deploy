package com.ijse.gdse.deploy_project.controller;

import com.ijse.gdse.deploy_project.entity.Customer;
import com.ijse.gdse.deploy_project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer) {
        System.out.println("Customer received: " + customer);
        customerService.saveCustomer(customer);
    }

}
