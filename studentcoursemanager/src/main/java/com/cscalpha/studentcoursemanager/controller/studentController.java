package com.cscalpha.studentcoursemanager.controller;

import com.cscalpha.studentcoursemanager.entities.Student;
import com.cscalpha.studentcoursemanager.service.studentService.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentcoursemanager")
public class studentController {

    //inject student service to interact with the student database
    @Autowired
    private studentService studentservice;

    @GetMapping("/getstudents")
    public List<Student> getStudents(){

        return studentservice.getAllStudents();
    }

    @GetMapping("/getstudent/{Id}")
    public Student getStudent(@PathVariable("Id") int id){

        return studentservice.getStudentById(id);
    }

    @PostMapping("/savestudent")
    public String saveStudent(@RequestBody Student theStudent){
        theStudent.setId(0);
        studentservice.save(theStudent);

        return "Succesfully saved the student " + theStudent;
    }

    @PutMapping("/updatestudent")
    public String updateStudent(@RequestBody Student theStudent){

        studentservice.save(theStudent);
        return "Student " + theStudent + "succesfully updated.";
    }

    @DeleteMapping("/deletestudent/{Id}")
    public String deleteStudent(@PathVariable("Id") int id){
        Student student = studentservice.getStudentById(id);

        if(student != null){
            studentservice.deleteStudent(id);
            return "Succesfully deleted the student " + student;
        }
        else {
            throw new RuntimeException("Student with Id " + id + "doesn't exist");
        }
    }
}
