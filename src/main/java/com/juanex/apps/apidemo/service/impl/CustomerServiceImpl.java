package com.juanex.apps.apidemo.service.impl;

import com.juanex.apps.apidemo.dto.CustomerResponse;
import com.juanex.apps.apidemo.entity.CustomerEntity;
import com.juanex.apps.apidemo.repository.CustomerRepository;
import com.juanex.apps.apidemo.service.CustomerService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import static java.util.Arrays.stream;

@ApplicationScoped
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Inject
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerResponse> findAll() {
        return customerRepository.listAll()
                .stream()
                .map(this::toResponse)
                .toList();

    }

    CustomerResponse toResponse(CustomerEntity customerEntity) {
        return new CustomerResponse(
                customerEntity.getId(),
                customerEntity.getFirstName(),
                customerEntity.getLastName(),
                customerEntity.getBirthOfDate()
        );
    }
}
