package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository  // because this interface is responsible for the data access
public interface StudentRepository extends JpaRepository<Student,Long> { // the id of the student is long that's why we gonna add long here


    // SELECT * FROM student WHERE email =? or else we can annotate this with @QUERY and add the query and that's jpql not straight sql
    Optional<Student> findStudentByEmail(String email);
}
