package com.cscalpha.studentcoursemanager.service.studentService;

import com.cscalpha.studentcoursemanager.entities.Student;
import com.cscalpha.studentcoursemanager.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentServiceImplementation implements studentService{

    //inject student repository

    @Autowired
    private StudentRepository studentrepository;


    @Override
    public List<Student> getAllStudents() {
        return studentrepository.findAll();
    }

    @Override
    public Student getStudentById(int theId) {

       Optional<Student> result = studentrepository.findById(theId);
       Student student = null;

       if(result.isPresent()){
           student = result.get();
       }
       else{
           throw new RuntimeException("student with Id " + theId + "not found.");
       }
        return student;
    }

    @Override
    public void save(Student theStudent) {
        studentrepository.save(theStudent);

    }

    @Override
    public void deleteStudent(int theId) {
        studentrepository.deleteById(theId);
    }
}
