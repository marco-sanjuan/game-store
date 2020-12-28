package com.marco.gamestore.customer.domain;

import com.marco.gamestore.shared.domain.EmailVO;
import lombok.Getter;

@Getter
public class CustomerLoginEmail extends EmailVO {

    public CustomerLoginEmail(String value) {
        super(value);
    }
}