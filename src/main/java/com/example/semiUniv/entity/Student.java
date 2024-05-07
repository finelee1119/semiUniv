package com.example.semiUniv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    private Long id;

    @Column(name = "student_name", length = 15, nullable = false)
    private String name;

    @Column(length = 10)
    private String birth;

    private String address;

    @Column(length = 13, nullable = false)
    private String phone;

    @Column(nullable = false)
    private String dept;

    private LocalDate entranceDate;

    private LocalDate graduateDate;

//    @OneToMany(mappedBy = "student")
//    private List<Apply> applies = new ArrayList<>();
}
