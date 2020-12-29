package com.marco.gamestore.customer.application.signup.notification;

import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerSignUpNotifier {

    public void sendNotification() {
        log.info("Email sent to customer after signup");
    }
}
