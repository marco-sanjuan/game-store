package com.marco.gamestore.customer.domain;

import com.marco.gamestore.shared.domain.model.UuidVO;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class CustomerId extends UuidVO {

    public CustomerId(String uuidString) {
        super(uuidString);
    }
}
