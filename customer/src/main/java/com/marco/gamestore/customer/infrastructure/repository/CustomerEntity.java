package com.marco.gamestore.customer.infrastructure.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "CUSTOMER")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String lastName;

    private String email;

    private String password;

}
