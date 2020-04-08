package com.demo.springboot.dao;

import com.demo.springboot.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface PersonDao {

    Student findByName(@Param("name")String name);

}
