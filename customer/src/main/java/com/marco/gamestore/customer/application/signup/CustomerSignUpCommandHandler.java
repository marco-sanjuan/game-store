package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.*;
import com.marco.gamestore.shared.domain.bus.command.CommandHandler;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerSignUpCommandHandler implements CommandHandler<CustomerSignUpCommand> {

    private final CustomerSignUpper customerSignUpper;

    @Override
    public void handle(CustomerSignUpCommand command) {

        CustomerName name = new CustomerName(command.getName());
        CustomerLastName lastName = new CustomerLastName(command.getLastName());
        CustomerLogin login = new CustomerLogin(new CustomerLoginEmail(command.getLoginEmail()), new CustomerLoginPassword(command.getLoginPassword()));

        customerSignUpper.signUpCustomer(name, lastName, login);
    }
}
