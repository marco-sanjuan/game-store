package com.marco.gamestore.customer.domain;

import com.marco.gamestore.shared.domain.model.EmailVO;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class CustomerLoginEmail extends EmailVO {

    public CustomerLoginEmail(String value) {
        super(value);
    }
}
