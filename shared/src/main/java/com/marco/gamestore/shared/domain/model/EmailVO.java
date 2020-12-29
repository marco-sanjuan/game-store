package com.marco.gamestore.shared.domain.model;

import lombok.Getter;

@Getter
public class EmailVO {

    private final String value;

    public EmailVO(String value) {
        if(value == null){
            throw new IllegalArgumentException("Email cannot be null");
        }
        if(!value.contains("@")){
            throw new IllegalArgumentException("Email should be valid");
        }
        this.value = value;
    }
}
