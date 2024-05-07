package com.example.semiUniv.repository;

import com.example.semiUniv.entity.Student;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final EntityManager em;

    public void save(Student student) {
        em.persist(student);
    }

    public Student findOne(Long id) {
        return em.find(Student.class, id);
    }

    public List<Student> findAll() {
        return em.createQuery("select s from Student s", Student.class)
                .getResultList();
    }

    public List<Student> findById(Long id) {
        return em.createQuery("select s from Student s where s.id = :id", Student.class)
                .setParameter("id", id)
                .getResultList();
    }
}
