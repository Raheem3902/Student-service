package com.Raheem.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllById(Integer schoolId);

    List<Student> findAllBySchoolId(Integer schoolId);
}
