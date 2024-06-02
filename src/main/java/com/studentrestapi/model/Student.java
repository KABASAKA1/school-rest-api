package com.studentrestapi.model;


import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int student_id;
    private String student_name;
    private int student_age;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int studentID) {
        this.student_id = studentID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public  void setStudent_name(String studentName) {
        this.student_name = studentName;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int studentAge) {
        this.student_age = studentAge;
    }

}
