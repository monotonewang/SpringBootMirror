package com.demo.springboot.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    public Course() {

    }

    public Course(String courseName) {
        this.name = courseName;
    }

    public Course(String courseName, Long courseId) {
        this.id = courseId;
        this.name = courseName;
    }

}
