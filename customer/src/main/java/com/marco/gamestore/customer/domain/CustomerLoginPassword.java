package com.marco.gamestore.customer.domain;

import lombok.Getter;

@Getter
public class CustomerLoginPassword {

    private final String value;

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
