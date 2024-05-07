package com.example.semiUniv.service;

import com.example.semiUniv.dto.SubjectDto;
import com.example.semiUniv.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<SubjectDto> subjectAllList() {
        return subjectRepository.findAll()
                .stream()
                .map(x -> SubjectDto.fromSubjectEntity(x))
                .toList();
    }
}
