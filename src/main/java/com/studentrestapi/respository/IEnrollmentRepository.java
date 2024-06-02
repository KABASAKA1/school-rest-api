package com.studentrestapi.respository;

import com.studentrestapi.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnrollmentRepository extends JpaRepository<Enrollment,Integer> {
}
