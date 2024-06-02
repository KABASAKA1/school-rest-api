package com.studentrestapi.controller;

import com.studentrestapi.model.Course;
import com.studentrestapi.model.Student;
import com.studentrestapi.service.CourseService;
import com.studentrestapi.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final ICourseService courseService;
    @Autowired
    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/{id}")
    public Course findById(@PathVariable int id) {
        return courseService.findById(id);
    }

    @GetMapping("")
    public List<Course> listAll() {
        return courseService.listAll();
    }

    @PostMapping("")
    public void add(@RequestBody Course course) {
        courseService.add(course);
    }

    @PutMapping("")
    public void update(@RequestBody Course course) {
        courseService.update(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        courseService.delete(id);
    }

}
