package com.example.semiUniv.dto;

import com.example.semiUniv.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class TeacherDto {
    private String teacherId;
    private String teacherName;
    private String birth;
    private String address;
    private String phone;
    private String dept;
    private LocalDate hireDate;
    private LocalDate retireDate;

    public static TeacherDto fromTeacherEntity(Teacher teacher){
        return new TeacherDto(teacher.getTeacherId(), teacher.getTeacherName(), teacher.getBirth(),
                teacher.getAddress(), teacher.getPhone(), teacher.getDept(), teacher.getHireDate(), teacher.getRetireDate());
    }

    public static Teacher fromTeacherDto(TeacherDto teacherDto){
        Teacher teacher = new Teacher();
        teacher.setTeacherId(teacherDto.getTeacherId());
        teacher.setTeacherName(teacherDto.getTeacherName());
        teacher.setBirth(teacherDto.getBirth());
        teacher.setAddress(teacherDto.getAddress());
        teacher.setPhone(teacherDto.getPhone());
        teacher.setDept(teacherDto.getDept());
        teacher.setHireDate(teacherDto.getHireDate());
        teacher.setRetireDate(teacherDto.getRetireDate());
        return teacher;
    }
}
