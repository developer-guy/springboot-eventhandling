package com.bthapaydin.eventhandling.listener;


import com.bthapaydin.eventhandling.event.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserEventListener { //implements ApplicationListener<UserEvent> {
    @EventListener
    public void handleUserEvent(UserEvent userEvent) {
        log.info("UserEvent fired :: {}", userEvent.getUser());
    }
}
