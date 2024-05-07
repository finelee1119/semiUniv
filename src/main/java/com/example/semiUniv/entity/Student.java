package com.example.semiUniv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
public class Student {
    @Id
    private String studentId;
    @Column(length = 15, nullable = false)
    private String studentName;
    @Column(length = 10)
    private String birth;
    private String address;
    @Column(length = 13, nullable = false)
    private String phone;
    @Column(nullable = false)
    private String dept;
    private LocalDate entranceDate;
    private LocalDate graduateDate;

}
