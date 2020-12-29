package com.marco.gamestore.shared.infrastructure.event;

import com.marco.gamestore.shared.domain.event.DomainEvent;
import com.marco.gamestore.shared.domain.event.DomainEventPublisher;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;

@Service
@Slf4j
@RequiredArgsConstructor
public class SpringDomainEventPublisher implements DomainEventPublisher {

    private final ApplicationEventPublisher publisher;

    @Override
    public void publish(final DomainEvent domainEvent) {

        this.publisher.publishEvent(domainEvent);

        log.info("Event published: {}", domainEvent);
    }
}
