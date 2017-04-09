package com.demo.springboot.controller;

import com.demo.springboot.pojo.Person;
import com.demo.springboot.respository.PersonRespository;
import com.demo.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wang on 17-4-9.
 */
@RestController
public class PersonController {

//    INSERT into  person  (age,name) values (18,'zhangsan');

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRespository personRespository;
    @GetMapping(value = "/getPerson")
    public List<Person> getPersons(){
        return personRespository.findAll();
    }

    @PostMapping(value = "/addPerson")
    public Person addPerson(@RequestParam(value = "age") Integer age,
                            @RequestParam(value = "name") String name){
        Person person=new Person();
        person.setAge(age);
        person.setName(name);
        return personRespository.save(person);
    }

    @GetMapping(value = "/getOnePerson/{id}")
    public Person getOnePerson(@PathVariable("id") Integer id){
        return  personRespository.findOne(id);
    }

    @PutMapping(value = "/updatePerson/{id}")
    public Person updatePerson(@PathVariable("id") Integer id,
                               @RequestParam("age") Integer age,
                               @RequestParam("name") String name){
        Person person=new Person();
        person.setId(id);
        person.setAge(age);
        person.setName(name);
        return  personRespository.save(person);
    }

    @DeleteMapping(value = "deletePerson/{id}")
    public void deletePerson(@PathVariable("id") Integer id){
        personRespository.delete(id);
    }

    @PostMapping(value = "/insertPersons")
    public void insertPersons(){
        personService.insertPersons();
    }

}
