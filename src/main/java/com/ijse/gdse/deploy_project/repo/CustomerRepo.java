package com.ijse.gdse.deploy_project.repo;

import com.ijse.gdse.deploy_project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
