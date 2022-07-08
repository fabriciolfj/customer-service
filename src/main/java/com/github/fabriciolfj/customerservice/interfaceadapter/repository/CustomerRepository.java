package com.github.fabriciolfj.customerservice.interfaceadapter.repository;

import com.github.fabriciolfj.customerservice.interfaceadapter.repository.data.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerData, Long> {
}
