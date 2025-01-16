package com.dockerdemoDb.dockerdemoDb.Service;

import com.dockerdemoDb.dockerdemoDb.Entity.Student;
import com.dockerdemoDb.dockerdemoDb.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  StudentRepo studentRepo;


    public Student addStudent(Student student) {
        Student st= studentRepo.save(student);
        return st;
    }

    public List<Student> getAllStudents() {
        List<Student> result= studentRepo.findAll();
        return result;
    }
}

