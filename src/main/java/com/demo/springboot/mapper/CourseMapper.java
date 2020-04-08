package com.demo.springboot.mapper;

import com.demo.springboot.pojo.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMapper {

    int insert(Course course);

    void delete(Long id);

}
