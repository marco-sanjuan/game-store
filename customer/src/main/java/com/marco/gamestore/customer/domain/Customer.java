package com.marco.gamestore.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class Customer {

    private final CustomerId id;

    private final CustomerName name;

    private final CustomerLastName lastName;

    private final CustomerLogin login;

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
}
