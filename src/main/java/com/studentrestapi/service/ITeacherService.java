package com.studentrestapi.service;

import com.studentrestapi.model.Teacher;

import java.util.List;

public interface ITeacherService {
    Teacher findById(int id);
    List<Teacher> listAll();
    void add(Teacher teacher);
    void update(Teacher teacher);
    void delete(int id);
}
