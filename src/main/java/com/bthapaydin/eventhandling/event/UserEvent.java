package com.bthapaydin.eventhandling.event;


import com.bthapaydin.eventhandling.domain.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {

    @Getter
    private User user;

    public UserEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

}
