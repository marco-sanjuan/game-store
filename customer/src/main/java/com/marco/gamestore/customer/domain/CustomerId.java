package com.marco.gamestore.customer.domain;

import com.marco.gamestore.shared.domain.model.UuidVO;
import lombok.Value;

@Value
public class CustomerId extends UuidVO {

    public CustomerId(String uuidString) {
        super(uuidString);
    }
}
