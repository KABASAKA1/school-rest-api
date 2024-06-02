package com.studentrestapi.controller;

import com.studentrestapi.model.Student;
import com.studentrestapi.service.IStudentService;
import com.studentrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id) {
        return studentService.findById(id);
    }

    @GetMapping("")
    public List<Student> listAll() {
        return studentService.listAll();
    }

    @PostMapping("")
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }

    @PutMapping("")
    public void update(@RequestBody Student student) {
        studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        studentService.delete(id);
    }
}
