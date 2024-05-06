package com.example.semiUniv.dto;

import com.example.semiUniv.entity.Student;
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

    public StudentDto(String studentId, String studentName, String birth, String address,
                      String phone, String dept, LocalDate entranceDate, LocalDate graduateDate) {
    }

    public static StudentDto fromStudentEntity(Student student){
        return new StudentDto(student.getStudentId(), student.getStudentName(), student.getBirth(), student.getAddress(),
                student.getPhone(), student.getDept(), student.getEntranceDate(), student.getGraduateDate());
    }

    public static Student fromStudentDto(StudentDto studentDto){
        Student student = new Student();
        student.setStudentId(studentDto.getStudentId());
        student.setStudentName(studentDto.getStudentName());
        student.setBirth(studentDto.getBirth());
        student.setAddress(studentDto.getAddress());
        student.setPhone(studentDto.getPhone());
        student.setDept(studentDto.getDept());
        student.setEntranceDate(studentDto.getEntranceDate());
        student.setGraduateDate(studentDto.getGraduateDate());
        return student;
    }
}
