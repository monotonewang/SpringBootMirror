package com.demo.springboot.controller;

import com.demo.springboot.pojo.Person;
import com.demo.springboot.respository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wang on 17-4-9.
 */
@RestController
public class PersonController {

//    INSERT into  person  (age,name) values (18,'zhangsan');

    @Autowired
    private PersonRespository personRespository;
    @GetMapping(value = "/getPerson")
    public List<Person> getPersons(){
        return personRespository.findAll();
    }
}
