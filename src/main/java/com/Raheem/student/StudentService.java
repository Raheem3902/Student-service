package com.Raheem.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private static StudentRepository repository;

    public static Student saveStudent(Student student){
         return repository.save(student);

    }
    public List<Student> findAllStudents(){
        return repository.findAll();

    }

    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }
}
