package com.example.semiUniv.entity;

import com.example.semiUniv.constant.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
public class User {
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
