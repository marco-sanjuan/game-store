package com.marco.gamestore.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Customer {

    private final CustomerId id;

    private final String name;

    private final String lastName;

    private final CustomerLogin login;

}
