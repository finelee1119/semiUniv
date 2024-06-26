package com.example.semiUniv.entity;

import com.example.semiUniv.constant.Complete;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gradeId;
    @Column(nullable = false)
    private String studentId;
    @Column(nullable = false)
    private Long subjectId;
    private int score;
    private String grade;
    @Enumerated(EnumType.STRING)
    private Complete complete;
}
