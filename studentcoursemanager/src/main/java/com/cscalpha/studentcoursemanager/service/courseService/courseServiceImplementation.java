package com.cscalpha.studentcoursemanager.service.courseService;

import com.cscalpha.studentcoursemanager.entities.Course;
import com.cscalpha.studentcoursemanager.entities.Student;
import com.cscalpha.studentcoursemanager.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class courseServiceImplementation implements courseService{

    //inject course repository
    @Autowired
    private CourseRepository courserepository;

    @Override
    public List<Course> getAllCourses() {
        return courserepository.findAll();
    }

    @Override
    public Course getCourseById(int theId) {
        Optional<Course> result = courserepository.findById(theId);
        Course course = null;

        if(result.isPresent()){
            course = result.get();
        }
        else{
            throw new RuntimeException("course with Id " + theId + "not found.");
        }
        return course;
    }

    @Override
    public void save(Course theCourse) {

        courserepository.save(theCourse);
    }

    @Override
    public void deleteCourse(int theId) {
        courserepository.deleteById(theId);
    }
}
