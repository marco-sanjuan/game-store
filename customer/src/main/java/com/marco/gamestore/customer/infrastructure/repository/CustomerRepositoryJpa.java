package com.marco.gamestore.customer.infrastructure.repository;

import com.marco.gamestore.customer.domain.Customer;
import com.marco.gamestore.customer.domain.CustomerRepository;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerRepositoryJpa implements CustomerRepository {

    private final CustomerDAO customerDAO;

    @Override
    public Customer save(Customer customer) {
        CustomerEntity dto = new CustomerEntity();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setLastName(customer.getLastName());
        dto.setEmail(customer.getLoginEmail());
        dto.setPassword(customer.getLoginPassword());

        CustomerEntity saved = customerDAO.save(dto);

        log.info("Customer saved");

        //TODO here, map from saved to new customer

        return customer;
    }
}
