package com.marco.gamestore.customer.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Customer {

    private final CustomerId id;

    private final CustomerName name;

    private final CustomerLastName lastName;

    private final CustomerLogin login;
}
