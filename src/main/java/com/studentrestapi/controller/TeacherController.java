package com.studentrestapi.controller;

import com.studentrestapi.model.Student;
import com.studentrestapi.model.Teacher;
import com.studentrestapi.service.ITeacherService;
import com.studentrestapi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final ITeacherService teacherService;
    @Autowired
    public TeacherController(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/{id}")
    public Teacher findById(@PathVariable int id) {
        return teacherService.findById(id);
    }

    @GetMapping("")
    public List<Teacher> listAll() {
        return teacherService.listAll();
    }

    @PostMapping("")
    public void add(@RequestBody Teacher teacher) {
        teacherService.add(teacher);
    }

    @PutMapping("")
    public void update(@RequestBody Teacher teacher) {
        teacherService.update(teacher);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        teacherService.delete(id);
    }
}
