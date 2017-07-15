package com.bthapaydin.eventhandling.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String userName;
    private boolean isAdmin;
    private String status;
}
