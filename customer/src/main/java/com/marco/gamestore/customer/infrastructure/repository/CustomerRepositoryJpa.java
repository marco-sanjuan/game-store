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
    public void save(Customer customer) {
        CustomerEntity dto = new CustomerEntity();
        dto.setId(customer.getId().getValueAsString());
        dto.setName(customer.getName().getValue());
        dto.setLastName(customer.getLastName().getValue());
        dto.setEmail(customer.getLogin().getEmail().getValue());
        dto.setPassword(customer.getLogin().getPassword().getValue());

        customerDAO.save(dto);

        log.info("Customer saved");
    }
}
