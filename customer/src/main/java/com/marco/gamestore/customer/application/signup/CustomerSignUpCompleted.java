package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.customer.domain.Customer;
import com.marco.gamestore.shared.domain.event.DomainEvent;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;

@ToString(callSuper = true)
public class CustomerSignUpCompleted extends DomainEvent {

    private final String eventName = "customer.signup.completed";

    private final String name;

    private final String lastName;

    private final String loginEmail;

    public CustomerSignUpCompleted(Customer customer) {
        super(customer.getId());
        this.name = customer.getName();
        this.lastName = customer.getLastName();
        this.loginEmail = customer.getLoginEmail();
    }

    @Override
    public String getEventName() {
        return eventName;
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<>() {{
            put("name", name);
            put("lastName", lastName);
            put("loginEmail", loginEmail);
        }};
    }

    @Override
    public DomainEvent fromPrimitives(String aggregateId, HashMap<String, Serializable> body, String eventId, String occurredOn) {
        return null;
    }
}
