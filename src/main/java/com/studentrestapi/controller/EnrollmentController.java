package com.studentrestapi.controller;

import com.studentrestapi.model.Enrollment;
import com.studentrestapi.service.IEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {
    private final IEnrollmentService enrollmentService;
    @Autowired
    public EnrollmentController(IEnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @GetMapping("/{id}")
    public Enrollment findById(@PathVariable int id) {
        return enrollmentService.findById(id);
    }

    @GetMapping("")
    public List<Enrollment> listAll() {
        return enrollmentService.listAll();
    }

    @PostMapping("")
    public void add(@RequestBody Enrollment enrollement) {
        enrollmentService.add(enrollement);
    }

    @PutMapping("")
    public void update(@RequestBody Enrollment enrollement) {
        enrollmentService.update(enrollement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        enrollmentService.delete(id);
    }
}
