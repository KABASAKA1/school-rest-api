package com.studentrestapi.service;

import com.studentrestapi.model.Course;
import com.studentrestapi.respository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService implements ICourseService {
    private final ICourseRepository courseRepository;
    @Autowired
    public CourseService(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @Override
    public Course findById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Course> listAll() {
        return courseRepository.findAll();
    }

    @Override
    public void add(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void update(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void delete(int id) {
        courseRepository.deleteById(id);
    }
}
