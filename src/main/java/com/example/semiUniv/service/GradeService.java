package com.example.semiUniv.service;

import com.example.semiUniv.dto.GradeDto;
import com.example.semiUniv.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;

    public List<GradeDto> gradeAllList() {
        return gradeRepository.findAll()
                .stream()
                .map(x -> GradeDto.fromGradeEntity(x))
                .toList();
    }

}
