//package com.demo.springboot.service;
//
//import com.demo.springboot.pojo.Person;
//import com.demo.springboot.respository.PersonRespository;
//import com.google.common.collect.Lists;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by wang on 17-4-9.
// */
//@Service
//public class PersonService {
//
//    @Autowired
//    private PersonRespository personRespository;
//
//    //set varchar(10) for tables
//    public void insertPersons(String name, int age) {
//        System.out.println("insertPersons");
//        personRespository.save(new Person(name, age));
//    }
//
//    public List<Person> findAll() {
//        Iterable<Person> all = personRespository.findAll();
//        List<Person> people = Lists.newArrayList(all);
//        return people;
//    }
//}
