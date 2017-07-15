package com.bthapaydin.eventhandling.producer;

import com.bthapaydin.eventhandling.event.UserEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserEventProducer {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void createUserEvent(UserEvent userEvent) {
        log.info("User event publishing :: {}", userEvent.getUser());
        applicationEventPublisher.publishEvent(userEvent);
    }
}
