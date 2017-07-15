package com.bthapaydin.eventhandling.rest;

import com.bthapaydin.eventhandling.domain.User;
import com.bthapaydin.eventhandling.event.UserEvent;
import com.bthapaydin.eventhandling.producer.UserEventProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserEventProducer userEventProducer;

    @RequestMapping(value = "/user/{name}/admin/{role}", method = RequestMethod.GET)
    public void userLogin(@PathVariable("name") String name, @PathVariable("role") boolean isAdmin) {
        User user = new User();
        user.setUserName(name);
        user.setAdmin(isAdmin);
        user.setStatus("ACTIVE");

        UserEvent userEvent = new UserEvent(this, user);

        userEventProducer.createUserEvent(userEvent);
    }
}
