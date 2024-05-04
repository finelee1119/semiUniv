package com.example.semiUniv.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class StudentDto {
    private String studentId;
    private String studentName;
    private String birth;
    private String address;
    private String phone;
    private String dept;
    private LocalDate entranceDate;
    private LocalDate graduateDate;

    private List<GradeDto> gradeDtoList;
    private List<SubjectDto> subjectDtoList;

}
