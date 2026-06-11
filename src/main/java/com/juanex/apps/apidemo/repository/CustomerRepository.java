package com.juanex.apps.apidemo.repository;

import com.juanex.apps.apidemo.entity.CustomerEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class CustomerRepository  implements PanacheRepositoryBase<CustomerEntity, UUID> {
}
