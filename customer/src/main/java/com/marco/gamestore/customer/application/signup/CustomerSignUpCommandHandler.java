package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.*;
import com.marco.gamestore.shared.domain.bus.command.CommandHandler;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerSignUpCommandHandler implements CommandHandler<CustomerSignUpCommand> {

    private final CustomerSignUpper customerSignUpper;

    @Override
    public void handle(CustomerSignUpCommand command) {

        //TODO implement UUID generation strategy
        CustomerId id = new CustomerId(UUID.randomUUID().toString());
        CustomerLogin login = new CustomerLogin(new CustomerLoginEmail(command.getLoginEmail()), new CustomerLoginPassword(command.getLoginPassword()));
        Customer customer = new Customer(id, command.getName(), command.getLastName(), login);

        //TODO should I pass VOs to AS instead of aggregate?
        customerSignUpper.signUpCustomer(customer);
    }
}
