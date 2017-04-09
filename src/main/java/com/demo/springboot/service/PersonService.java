package com.demo.springboot.service;

import com.demo.springboot.pojo.Person;
import com.demo.springboot.respository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wang on 17-4-9.
 */
@Service
public class PersonService {
    @Autowired
    private PersonRespository personRespository;

    //set varchar(10) for tables
    @Transactional
    public void insertPersons(){
        Person person=new Person();
        person.setAge(10);
        person.setName("w");
        personRespository.save(person);

        Person person1=new Person();
        person1.setAge(10);
        person1.setName("wangfdadsadfawu");
        personRespository.save(person1);
    }
}
