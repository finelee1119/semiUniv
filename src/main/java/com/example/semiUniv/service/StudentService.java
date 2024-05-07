package com.example.semiUniv.service;

import com.example.semiUniv.dto.StudentDto;
import com.example.semiUniv.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<StudentDto> studentAllList() {
        return studentRepository.findAll()
                .stream()
                .map(x -> StudentDto.fromStudentEntity(x))
                .toList();
    }
}
