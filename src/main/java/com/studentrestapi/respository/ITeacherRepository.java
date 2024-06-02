package com.studentrestapi.respository;

import com.studentrestapi.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {
}
