package com.demo.springboot.mapper;

import com.demo.springboot.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {

    Student findByName(String name);

}
