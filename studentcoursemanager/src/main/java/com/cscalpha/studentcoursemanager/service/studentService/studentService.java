package com.cscalpha.studentcoursemanager.service.studentService;

import com.cscalpha.studentcoursemanager.entities.Student;

import java.util.List;

public interface studentService {

    public List<Student> getAllStudents();
    public Student getStudentById(int theId);
    public void save(Student theStudent);
    public void deleteStudent(int theId);
}
