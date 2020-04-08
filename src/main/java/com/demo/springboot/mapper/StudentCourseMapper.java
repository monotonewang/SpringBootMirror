package com.demo.springboot.mapper;

import com.demo.springboot.pojo.Course;
import com.demo.springboot.pojo.StudentCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCourseMapper {

    int insert(StudentCourse studentCourse);

    void delete(Long id);

    List<StudentCourse> getCourseByStudent(Long studentId);
}
