package com.demo.springboot.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer studentId;

    private String studentName;

    private String courseName;

    private Integer courseId;

    private Integer visible;

    public StudentCourse() {

    }

    public StudentCourse(Integer studentId, Integer courseId) {
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public StudentCourse(Integer id, Integer studentId, Integer courseId) {
        this.id = id;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public StudentCourse(Integer id,Integer studentId, Integer courseId, Integer visible) {
        this.id = id;
        this.courseId = courseId;
        this.studentId = studentId;
        this.visible = visible;
    }


}
