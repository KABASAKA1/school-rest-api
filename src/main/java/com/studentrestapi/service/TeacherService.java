package com.studentrestapi.service;

import com.studentrestapi.model.Teacher;
import com.studentrestapi.respository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService {
    private final ITeacherRepository teacherRepository;
    @Autowired
    public TeacherService(ITeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher findById(int id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public List<Teacher> listAll() {
        return teacherRepository.findAll();
    }

    @Override
    public void add(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void delete(int id) {
        teacherRepository.deleteById(id);
    }
}
