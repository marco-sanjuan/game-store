package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.shared.domain.bus.command.Command;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CustomerSignUpCommand implements Command {

    private final String name;

    private final String lastName;

    private final String loginEmail;

    private final String loginPassword;
}
