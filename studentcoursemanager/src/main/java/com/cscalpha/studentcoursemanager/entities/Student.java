package com.cscalpha.studentcoursemanager.entities;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "university")
    private String university;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "username")
    private String username;

    @Column(name = "userpassword")
    private String userPassword;

    public Student() {
    }

    public Student(String firstName, String lastName, String university, String faculty, String username, String userPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.university = university;
        this.faculty = faculty;
        this.username = username;
        this.userPassword = userPassword;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
