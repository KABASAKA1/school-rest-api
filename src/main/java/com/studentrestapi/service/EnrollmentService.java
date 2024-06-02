package com.studentrestapi.service;

import com.studentrestapi.model.Enrollment;
import com.studentrestapi.respository.IEnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService implements IEnrollmentService {
    private IEnrollmentRepository enrollmentRepository;
    @Autowired
    public EnrollmentService(IEnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }
    @Override
    public Enrollment findById(int id) {
        return enrollmentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Enrollment> listAll() {
        return enrollmentRepository.findAll();
    }

    @Override
    public void add(Enrollment enrollement) {
        enrollmentRepository.save(enrollement);
    }

    @Override
    public void update(Enrollment enrollement) {
        enrollmentRepository.save(enrollement);
    }

    @Override
    public void delete(int id) {
        enrollmentRepository.deleteById(id);
    }
}
