package com.example.semiUniv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
public class Teacher {
    @Id
    private String teacherId;
    @Column(nullable = false)
    private String teacherName;
    @Column(length = 10)
    private String birth;
    private String address;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String dept;
    private LocalDate hireDate;
    private LocalDate retireDate;

}
