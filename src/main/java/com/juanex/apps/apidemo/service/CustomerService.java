package com.juanex.apps.apidemo.service;

import com.juanex.apps.apidemo.dto.CustomerRequest;
import com.juanex.apps.apidemo.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {
    List<CustomerResponse> findAll();

    CustomerResponse create(CustomerRequest customerRequest);
}
