package com.example.semiUniv.entity;

import com.example.semiUniv.constant.Week;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;
    @Column(nullable = false)
    private String subjectName;
    private String teacherId; //nullable 조건 삭제
    private int classRoom;
    @Enumerated(EnumType.STRING)
    private Week day;
    private LocalTime startTime;
    private LocalTime endTime;
    private int maxStudent;
    private int credit;

}
