package com.marco.gamestore.customer.application.signup;

import com.marco.gamestore.shared.domain.event.DomainEvent;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;

@ToString(callSuper = true)
public class CustomerSignUpCompletedEvent extends DomainEvent {

    private final String eventName = "customer.signup.completed";

    private final String name;

    private final String lastName;

    private final String loginEmail;

    //TODO this constructor is evil, try another way to create event (Customer class not visible here)
    public CustomerSignUpCompletedEvent(String customerId, String name, String lastName, String loginEmail) {
        super(customerId);
        this.name = name;
        this.lastName = lastName;
        this.loginEmail = loginEmail;
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
