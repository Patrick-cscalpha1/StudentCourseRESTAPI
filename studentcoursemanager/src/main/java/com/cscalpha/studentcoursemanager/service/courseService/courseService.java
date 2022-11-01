package com.cscalpha.studentcoursemanager.service.courseService;

import com.cscalpha.studentcoursemanager.entities.Course;

import java.util.List;

public interface courseService {

    public List<Course> getAllCourses();
    public Course getCourseById(int theId);
    public void save(Course theCourse);
    public void deleteCourse(int theId);
}
