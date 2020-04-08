package com.demo.springboot.service;

import com.demo.springboot.mapper.PersonMapper;
import com.demo.springboot.pojo.Person;
import com.demo.springboot.pojo.Student;
import com.demo.springboot.respository.PersonRespository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 17-4-9.
 *
 */
@Service
public class PersonService {

    @Autowired
    private PersonRespository personRespository;

    @Autowired
    private PersonMapper personMapper;

    //set varchar(10) for tables
    public void insertPersons(String name, int age) {
        System.out.println("insertPersons");
        personRespository.save(new Student(name, age));
    }

    public List<Student> findAll() {
        Iterable<Student> all = personRespository.findAll();
        List<Student> people = Lists.newArrayList(all);
        return people;
    }

    public Student findByName(String name){
        return personMapper.findByName (name);
    }

    public Student findById(String id) {
        return personRespository.findStudentById (Long.valueOf(id));
    }
}
