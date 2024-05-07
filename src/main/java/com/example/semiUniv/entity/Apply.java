package com.example.semiUniv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apply_id")
    private Long id;

    @Column(nullable = false)
    private String studentId;

    @Column(nullable = false)
    private Long subjectId;
}
