package com.marco.gamestore.webapp.controller;

import com.marco.gamestore.customer.application.signup.CustomerSignUpper;
import com.marco.gamestore.customer.domain.Customer;
import com.marco.gamestore.customer.domain.CustomerId;
import com.marco.gamestore.customer.domain.CustomerLogin;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerSignUpController {

    private final CustomerSignUpper customerSignUpper;

    @PostMapping("/")
    public void signUp(@RequestParam String email, HttpServletRequest httpRequest){
        CustomerId id = new CustomerId(UUID.randomUUID().toString());
        CustomerLogin login = new CustomerLogin(email, "1234");
        Customer customer = new Customer(id, "nombre", "apellido", login);
        customerSignUpper.signUpCustomer(customer);
    }

}
