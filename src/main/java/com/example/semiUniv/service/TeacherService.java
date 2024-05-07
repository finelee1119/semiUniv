package com.example.semiUniv.service;

import com.example.semiUniv.dto.TeacherDto;
import com.example.semiUniv.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public List<TeacherDto> teacherAllList() {
        return teacherRepository.findAll()
                .stream()
                .map(x -> TeacherDto.fromTeacherEntity(x))
                .toList();
    }
}
