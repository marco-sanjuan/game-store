package com.marco.gamestore.customer.infrastructure.repository;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
