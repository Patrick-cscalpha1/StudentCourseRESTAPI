package com.cscalpha.studentcoursemanager.controller;

import com.cscalpha.studentcoursemanager.entities.Course;
import com.cscalpha.studentcoursemanager.service.courseService.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentcoursemanager")
public class courseController {

    //inject the course service to interact with the course database
    @Autowired
    private courseService courseservice;

    @GetMapping("/getcourses")
    public List<Course> getCourses(){

        return courseservice.getAllCourses();
    }

    @GetMapping("/getcoursebyId/{Id}")
    public Course getCourse(@PathVariable("Id") int id){

        return courseservice.getCourseById(id);
    }

    @PostMapping("/savecourse")
    public String saveStudent(@RequestBody Course course){

        course.setId(0);
        courseservice.save(course);
        return "Successfuly saved the course " + course;
    }

    @PutMapping("/updatecourse")
    public String updateCourse(@RequestBody Course course){

        courseservice.save(course);
        return "Course " + course + "successfuly updated.";
    }

   @DeleteMapping("/deletecourse/{Id}")
   public String deleteCourse(@PathVariable("Id") int id){

        Course thecourse = courseservice.getCourseById(id);
        if (thecourse != null){

            courseservice.deleteCourse(id);
            return "Successfully deleted the course " + thecourse;
        }else {
            throw new RuntimeException("Course with Id " + id + "doesn't exist.");
        }
   }
}
