package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.Customer;
import com.marco.gamestore.customer.domain.CustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerSignUpper {

    private final CustomerRepository customerRepository;

    public Customer signUpCustomer(Customer customer){

        return customerRepository.save(customer);
    }
}
