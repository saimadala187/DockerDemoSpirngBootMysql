package com.dockerdemoDb.dockerdemoDb.Repository;

import com.dockerdemoDb.dockerdemoDb.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
