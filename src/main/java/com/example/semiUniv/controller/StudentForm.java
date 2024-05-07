package com.example.semiUniv.controller;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentForm {

    @NotNull(message = "학번은 필수 입니다.")
    private Long id;

    @NotEmpty(message = "이름은 필수 입니다.")
    private String name;

    private String birth;
    private String address;

    @NotEmpty(message = "연락처는 필수 입니다.")
    private String phone;

    @NotEmpty(message = "소속학과는 필수 입니다.")
    private String dept;

    private LocalDate entranceDate;
    private LocalDate graduateDate;
}
