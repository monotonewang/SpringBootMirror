package com.demo.springboot.controller;

import com.alibaba.fastjson.JSON;
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
@RequestMapping(path = "/person")
public class PersonController {

//    INSERT into  person  (age,name) values (18,'zhangsan');

    @Autowired
    private PersonService personService;


    @PostMapping(value = "/insert")
    public String insertPersons(@RequestBody Person person) {
        System.out.println("person=" + person);
        personService.insertPersons(person.getName(), person.getAge());
        return "Saved";
    }

//    @Autowired
//    private PersonRespository personRespository;

    @PostMapping(value = "/getPersons")
    public String getPersons() {
        List<Person> personList = personService.findAll();
        System.out.println(personList);
        return  JSON.toJSONString(personList);
    }

//    @PostMapping(value = "/addPerson")
//    public Person addPerson(@RequestParam(value = "age") Integer age,
//                            @RequestParam(value = "name") String name) {
//        Person person = new Person(name, age);
//        return personRespository.save(person);
//    }

//    @GetMapping(value = "/getOnePerson/{id}")
//    public Person getOnePerson(@PathVariable("id") Integer id){
//        return  personRespository.findOne(id);
//    }

//    @PutMapping(value = "/updatePerson/{id}")
//    public Person updatePerson(@PathVariable("id") Long id,
//                               @RequestParam("age") Integer age,
//                               @RequestParam("name") String name) {
//        Person person = new Person(id, age, name);
//        return personRespository.save(person);
//    }

//    @DeleteMapping(value = "deletePerson/{id}")
//    public void deletePerson(@PathVariable("id") Integer id){
//        personRespository.delete(id);
//    }

}
