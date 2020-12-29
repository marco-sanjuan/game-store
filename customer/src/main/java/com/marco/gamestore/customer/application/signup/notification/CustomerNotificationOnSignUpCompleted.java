package com.marco.gamestore.customer.application.signup.notification;

import com.marco.gamestore.customer.application.signup.CustomerSignUpCompletedEvent;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerNotificationOnSignUpCompleted {

    private final CustomerSignUpNotifier customerSignUpNotifier;

    @EventListener
    public void on(CustomerSignUpCompletedEvent event) {

        log.info("Event received: {}", event);

        customerSignUpNotifier.sendNotification();
    }
}
