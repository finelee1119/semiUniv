package com.example.semiUniv.dto;

import com.example.semiUniv.constant.Complete;
import com.example.semiUniv.constant.Week;
import com.example.semiUniv.entity.Grade;
import com.example.semiUniv.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class SubjectDto {
    private Long subjectId;
    private String subjectName;
    private String teacherName;
    private String classRoom;
    private String day;
    private LocalTime startTime;
    private LocalTime endTime;
    private int maxStudent;
    private int credit;

    public static SubjectDto fromSubjectEntity(Subject subject){
        return new SubjectDto(subject.getSubjectId(), subject.getSubjectName(),
                subject.getTeacherName(), subject.getClassRoom(),
                String.valueOf(subject.getDay()), subject.getStartTime(), subject.getEndTime(),
                subject.getMaxStudent(), subject.getCredit());
    }

    public Subject fromSubjectDto(SubjectDto subjectDto){
        Subject subject = new Subject();
        subject.setSubjectId(subjectDto.getSubjectId());
        subject.setSubjectName(subjectDto.getSubjectName());
        subject.setTeacherName(subjectDto.getTeacherName());
        subject.setClassRoom(subjectDto.getClassRoom());
        subject.setDay(Week.valueOf(subjectDto.getDay()));
        subject.setStartTime(subjectDto.getStartTime());
        subject.setEndTime(subjectDto.getEndTime());
        subject.setMaxStudent(subjectDto.getMaxStudent());
        subject.setCredit(subjectDto.getCredit());
        return subject;
    }
}
