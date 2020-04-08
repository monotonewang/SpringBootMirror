package com.demo.springboot.service;

import com.demo.springboot.mapper.CourseMapper;
import com.demo.springboot.mapper.StudentCourseMapper;
import com.demo.springboot.pojo.Course;
import com.demo.springboot.pojo.StudentCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseService {

    @Autowired
    StudentCourseMapper studentCourseMapper;

    /**
     * 加入我的学习列表
     *
     * @param studentId
     * @param courseId
     */
    public void insert(String studentId, String courseId) {
        System.out.println("studentCourseMapper insert");
        studentCourseMapper.insert(new StudentCourse(Integer.valueOf(studentId), Integer.valueOf(courseId)));
    }

    public List<StudentCourse> getCourseByStudent(String studentId) {
        System.out.println("studentCourseMapper getCourseByStudent");
        return studentCourseMapper.getCourseByStudent(Long.valueOf(studentId));
    }


}
