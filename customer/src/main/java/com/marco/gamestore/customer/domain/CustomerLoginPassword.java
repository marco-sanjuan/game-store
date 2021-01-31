package com.marco.gamestore.customer.domain;

import lombok.Value;

@Value
public class CustomerLoginPassword {

    String value;

    public CustomerLoginPassword(String value) {
        if(value == null){
            throw new IllegalArgumentException("Password cannot be null");
        }
        if(value.length() < 5){
            throw new IllegalArgumentException("Password should be valid");
        }
        this.value = value;
    }
}
