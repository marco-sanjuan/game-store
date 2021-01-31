package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.*;
import com.marco.gamestore.shared.domain.event.DomainEventPublisher;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerSignUpper {

    private final CustomerRepository customerRepository;
    private final DomainEventPublisher domainEventPublisher;

    public void signUpCustomer(CustomerId id, CustomerName name, CustomerLastName lastName, CustomerLogin login) {

        Customer customer = new Customer(id, name, lastName, login);

        customerRepository.save(customer);

        domainEventPublisher.publish(new CustomerSignUpCompletedEvent(customer.getId().getValueAsString(),
                customer.getName().getValue(),
                customer.getLastName().getValue(),
                customer.getLogin().getEmail().getValue()));
    }
}
