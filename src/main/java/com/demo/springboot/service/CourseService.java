package com.demo.springboot.service;

import com.demo.springboot.mapper.CourseMapper;
import com.demo.springboot.pojo.Course;
import com.demo.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    //set varchar(10) for tables
    public void insert(String name) {
        System.out.println("insert");
        courseMapper.insert(new Course(name));
    }

    public void delete(String id) {
        System.out.println("delete");
        courseMapper.delete(Long.valueOf(id));
    }
}
