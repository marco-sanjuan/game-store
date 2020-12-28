package com.marco.gamestore.webapp.config;

import com.marco.gamestore.customer.application.signup.CustomerSignUpper;
import com.marco.gamestore.customer.domain.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public CustomerSignUpper getCustomerSignUpper(CustomerRepository customerRepository){
        return new CustomerSignUpper(customerRepository);
    }
}
