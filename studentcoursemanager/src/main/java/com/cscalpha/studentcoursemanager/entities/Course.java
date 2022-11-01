package com.cscalpha.studentcoursemanager.entities;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "state")
    private String state;

    @Column(name = "year")
    private int year;

    @Column(name = "session")
    private String session;

    public Course() {
    }

    public Course(String courseName, String teacherName, String state, int year, String session) {
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.state = state;
        this.year = year;
        this.session = session;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + Id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", state='" + state + '\'' +
                ", year=" + year +
                ", session='" + session + '\'' +
                '}';
    }


}
