package com.example.semiUniv.dto;

import com.example.semiUniv.constant.Week;
import lombok.Data;

import java.time.LocalTime;

@Data
public class SubjectDto {
    private Long subjectId;
    private String subjectName;
    private String teacherName;
    private String classRoom;
    private Week day;
    private LocalTime startTime;
    private int maxStudent;
    private int credit;

}
