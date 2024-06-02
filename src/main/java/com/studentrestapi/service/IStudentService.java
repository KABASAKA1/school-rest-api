package com.studentrestapi.service;

import com.studentrestapi.model.Student;

import java.util.List;

public interface IStudentService {
    Student findById(int id);
    List<Student> listAll();
    void add(Student student);
    void update(Student student);
    void delete(int id);
}
