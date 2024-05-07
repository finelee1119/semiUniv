package com.example.semiUniv.controller;

import com.example.semiUniv.entity.Student;
import com.example.semiUniv.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //등록
    @GetMapping("/students/new")
    public String createForm(Model model) {
        model.addAttribute("studentForm", new StudentForm());
        return "students/createStudentForm";
    }

    @PostMapping("/students/new")
    public String create(@Valid StudentForm form, BindingResult result) {

        if (result.hasErrors()) {
            return "students/createStudentForm";
        }

        Student student = new Student();
        student.setId(form.getId());
        student.setName(form.getName());
        student.setPhone(form.getPhone());
        student.setDept(form.getDept());

        studentService.join(student);
        return "redirect:/";
    }

    //조회
    @GetMapping("/students")
    public String list(Model model) {
        List<Student> students = studentService.findStudents();
        model.addAttribute("students", students);
        return "students/studentList";
    }

    //수정
    @GetMapping("/students/{studentId}/edit")
    public String updateStudentForm(@PathVariable("studentId") Long studentId, Model model) {
        Student student = studentService.findOne(studentId);

        StudentForm form = new StudentForm();
        form.setId(student.getId());
        form.setName(student.getName());

        form.setBirth(student.getBirth());
        form.setAddress(student.getAddress());
        form.setPhone(student.getPhone());

        form.setDept(student.getDept());
        form.setEntranceDate(student.getEntranceDate());
        form.setGraduateDate(student.getGraduateDate());

        model.addAttribute("form", form);
        return "students/updateStudentForm";
    }

    @PostMapping("/students/{studentId}/edit")
    public String updateStudent(@PathVariable Long studentId, @ModelAttribute("form") StudentForm form) {

        studentService.updateStudent(
                studentId,
                form.getName(),

                form.getBirth(),
                form.getAddress(),
                form.getPhone(),

                form.getDept(),
                form.getEntranceDate(),
                form.getGraduateDate()
                );

        return "redirect:/students";
    }
}
