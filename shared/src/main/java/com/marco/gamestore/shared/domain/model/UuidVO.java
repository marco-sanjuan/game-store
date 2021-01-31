package com.marco.gamestore.shared.domain.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class UuidVO {

    private final UUID value;

    public UuidVO(String uuidString) {
        this.value = UUID.fromString(uuidString);
    }

    public String getValueAsString(){
        return value.toString();
    }
}
