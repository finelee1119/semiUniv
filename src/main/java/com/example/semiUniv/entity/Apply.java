package com.example.semiUniv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    @Column(nullable = false)
    private String studentId;
    @Column(nullable = false)
    private Long subjectId;
}
