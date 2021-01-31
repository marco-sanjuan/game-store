package com.marco.gamestore.webapp.controller;

import com.marco.gamestore.customer.application.signup.CustomerSignUpCommand;
import com.marco.gamestore.shared.domain.bus.command.CommandBus;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerSignUpController {

    private final CommandBus commandBus;

    @PostMapping("/")
    public void signUp(
            @ApiParam(defaultValue = "A_UUID") @RequestParam String id,
            @ApiParam(defaultValue = "Pedro") @RequestParam String name,
            @ApiParam(defaultValue = "Gadicto") @RequestParam String lastName,
            @ApiParam(defaultValue = "prueba@test") @RequestParam String loginEmail,
            @ApiParam(defaultValue = "12345") @RequestParam String loginPassword){

        //TODO we emulate incoming UUID to fake new one
        String finalId = id.equals("A_UUID")?UUID.randomUUID().toString():id;

        CustomerSignUpCommand command = new CustomerSignUpCommand(finalId, name, lastName, loginEmail, loginPassword);
        commandBus.handle(command);
    }

}
