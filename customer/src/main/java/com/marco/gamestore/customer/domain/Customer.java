package com.marco.gamestore.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Customer {

    private final CustomerId id;

    @Getter
    private final CustomerName name;

    @Getter
    private final CustomerLastName lastName;

    private final CustomerLogin login;

    public String getId(){
        return id.getValue();
    }

    public String getLoginEmail(){
        return login.getEmail().getValue();
    }

    public String getLoginPassword(){
        return login.getPassword().getValue();
    }

}
