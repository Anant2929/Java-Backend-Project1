package com.anant.student_management_system.repository;

import com.anant.student_management_system.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByName, findByEmail, etc.

}
