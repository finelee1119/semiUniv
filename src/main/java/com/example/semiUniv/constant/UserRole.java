package com.example.semiUniv.constant;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN ("ROLE_ADMIN"),
    STUDENT ("ROLE_STUDENT"),
    TEACHER ("ROLE_TEACHER");

    private String value;
    UserRole(String value) {
        this.value = value;
    }
}
