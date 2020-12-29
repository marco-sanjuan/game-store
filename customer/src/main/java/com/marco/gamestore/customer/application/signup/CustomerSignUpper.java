package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.Customer;
import com.marco.gamestore.customer.domain.CustomerRepository;
import com.marco.gamestore.shared.domain.event.DomainEventPublisher;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerSignUpper {

    private final CustomerRepository customerRepository;
    private final DomainEventPublisher domainEventPublisher;

    public Customer signUpCustomer(final Customer customer){

        final Customer savedCustomer = customerRepository.save(customer);

        domainEventPublisher.publish(new CustomerSignUpCompletedEvent(savedCustomer.getId(),
                savedCustomer.getName(),
                savedCustomer.getLastName(),
                savedCustomer.getLoginEmail()));

        return savedCustomer;
    }
}
