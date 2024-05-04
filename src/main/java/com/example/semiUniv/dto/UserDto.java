package com.example.semiUniv.dto;

import com.example.semiUniv.constant.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

    @NotEmpty(message = "학번 또는 교번을 입력해주세요.")
    private String username;
    private String password;


}
