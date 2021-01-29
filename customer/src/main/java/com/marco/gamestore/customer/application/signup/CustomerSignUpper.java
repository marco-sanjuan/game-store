package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.*;
import com.marco.gamestore.shared.domain.event.DomainEventPublisher;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerSignUpper {

    private final CustomerRepository customerRepository;
    private final DomainEventPublisher domainEventPublisher;

    public Customer signUpCustomer(CustomerName name, CustomerLastName lastName, CustomerLogin login) {

        CustomerId id = new CustomerId(UUID.randomUUID().toString());
        Customer customer = new Customer(id, name, lastName, login);

        final Customer savedCustomer = customerRepository.save(customer);

        domainEventPublisher.publish(new CustomerSignUpCompletedEvent(savedCustomer.getId(),
                savedCustomer.getName().getValue(),
                savedCustomer.getLastName().getValue(),
                savedCustomer.getLoginEmail()));

        return savedCustomer;

    }
}
