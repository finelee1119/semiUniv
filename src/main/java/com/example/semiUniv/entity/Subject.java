package com.example.semiUniv.entity;

import com.example.semiUniv.constant.Week;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;
@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subjectId;
    @Column(nullable = false)
    private String subjectName;
    @Column(nullable = false)
    private String teacherName;
    private String classRoom;
    @Enumerated(EnumType.STRING)
    private Week day;
    private LocalTime startTime;
    private int maxStudent;
    private int credit;

}