package com.studentrestapi.service;

import com.studentrestapi.model.Enrollment;

import java.util.List;

public interface IEnrollmentService {
    Enrollment findById(int id);
    List<Enrollment> listAll();
    void add(Enrollment enrollement);
    void update(Enrollment enrollement);
    void delete(int id);
}
