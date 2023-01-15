package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // because this interface is responsible for the data access
public interface StudentRepository extends JpaRepository<Student,Long> { // the id of the student is long that's why we gonna add long here


}
