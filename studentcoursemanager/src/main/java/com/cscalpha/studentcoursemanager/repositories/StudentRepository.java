package com.cscalpha.studentcoursemanager.repositories;

import com.cscalpha.studentcoursemanager.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer> {
}
