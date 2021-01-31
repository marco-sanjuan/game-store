package com.marco.gamestore.customer.domain;

import lombok.Value;

@Value
public class CustomerLogin {

    CustomerLoginEmail email;

    CustomerLoginPassword password;
}
