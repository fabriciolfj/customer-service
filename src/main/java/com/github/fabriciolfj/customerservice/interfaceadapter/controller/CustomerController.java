package com.github.fabriciolfj.customerservice.interfaceadapter.controller;

import com.github.fabriciolfj.customerservice.business.usecase.CreateCustomerCase;
import com.github.fabriciolfj.customerservice.infrastructure.dto.request.CustomerRequest;
import com.github.fabriciolfj.customerservice.infrastructure.dto.response.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerController {

    private final CreateCustomerCase createCustomerCase;

    public CustomerResponse create(final CustomerRequest request) {

    }
}
