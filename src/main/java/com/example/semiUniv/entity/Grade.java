package com.example.semiUniv.entity;

import com.example.semiUniv.constant.Complete;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gradeId;
    @Column(nullable = false)
    private String studentId;
    @Column(nullable = false)
    private Long subjectName;
    private int score;
    private String grade;
    @Enumerated(EnumType.STRING)
    private Complete complete;
}
