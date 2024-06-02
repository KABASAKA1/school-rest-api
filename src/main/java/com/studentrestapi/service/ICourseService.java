package com.studentrestapi.service;

import com.studentrestapi.model.Course;
import com.studentrestapi.model.Student;

import java.util.List;

public interface ICourseService {
    Course findById(int id);
    List<Course> listAll();
    void add(Course course);
    void update(Course course);
    void delete(int id);
}
