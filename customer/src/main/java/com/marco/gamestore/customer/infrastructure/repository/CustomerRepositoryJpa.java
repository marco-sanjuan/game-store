package com.marco.gamestore.customer.infrastructure.repository;

import com.marco.gamestore.customer.domain.Customer;
import com.marco.gamestore.customer.domain.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Slf4j
@Transactional
@Component
@RequiredArgsConstructor
public class CustomerRepositoryJpa implements CustomerRepository {

    private final CustomerDAO customerDAO;

    @Override
    public Customer store(Customer customer) {
        CustomerEntity dto = new CustomerEntity();
        dto.setId(customer.getId().getValue());
        dto.setName(customer.getName());
        dto.setLastName(customer.getLastName());
        dto.setEmail(customer.getLogin().getEmail());
        dto.setPassword(customer.getLogin().getPassword());

        CustomerEntity saved = customerDAO.save(dto);

        log.info("Customer saved");

        //TODO here, map from saved to new customer

        return customer;
    }
}
