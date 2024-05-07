package com.example.semiUniv.service;

import com.example.semiUniv.entity.Student;
import com.example.semiUniv.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    //등록
    @Transactional
    public Long join(Student student) {

        validateDuplicateStudent(student);
        studentRepository.save(student);
        return student.getId();
    }

    private void validateDuplicateStudent(Student student) {
        List<Student> findStudents = studentRepository.findById(student.getId());
        if (!findStudents.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    //조회
    public List<Student> findStudents() {
        return studentRepository.findAll();
    }

    public Student findOne(Long studentId) {
        return studentRepository.findOne(studentId);
    }

    //수정
    public void updateStudent(Long studentId, String name, String birth, String address, String phone, String dept, LocalDate entranceDate, LocalDate graduateDate) {
        Student student = studentRepository.findOne(studentId);
        student.setName(name);

        student.setBirth(birth);
        student.setAddress(address);
        student.setPhone(phone);

        student.setDept(dept);
        student.setEntranceDate(entranceDate);
        student.setGraduateDate(graduateDate);
    }

}
