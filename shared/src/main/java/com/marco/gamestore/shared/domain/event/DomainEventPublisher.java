package com.marco.gamestore.shared.domain.event;

public interface DomainEventPublisher {

    void publish(DomainEvent domainEvent);
}
