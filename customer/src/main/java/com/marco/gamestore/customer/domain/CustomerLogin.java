package com.marco.gamestore.customer.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CustomerLogin {

    private final CustomerLoginEmail email;

    private final CustomerLoginPassword password;
}
