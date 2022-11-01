package com.cscalpha.studentcoursemanager.repositories;

import com.cscalpha.studentcoursemanager.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
