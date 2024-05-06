package com.example.semiUniv.dto;

import com.example.semiUniv.constant.Complete;
import com.example.semiUniv.entity.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class GradeDto {
    private Long gradeId;
    private String studentId;
    private String subjectName;
    private int score;
    private String grade;
    private String complete;

    public GradeDto(Long gradeId, String studentId, String subjectName, int score, String grade, String strComplete) {
    }

    public static GradeDto fromGradeEntity(Grade grade){
        String strComplete = String.valueOf(grade.getComplete());
        return new GradeDto(grade.getGradeId(),
                grade.getStudentId(),grade.getSubjectName(),
                grade.getScore(),grade.getGrade(), strComplete);
    }
    public Grade fromGradeDto(GradeDto gradeDto){
        Grade grade = new Grade();
        grade.setGradeId(gradeDto.getGradeId());
        grade.setStudentId(gradeDto.getStudentId());
        grade.setSubjectName(gradeDto.getSubjectName());
        grade.setScore(gradeDto.getScore());
        grade.setGrade(gradeDto.getGrade());
        grade.setComplete(Complete.valueOf(gradeDto.getComplete()));
        return grade;
    }
}
