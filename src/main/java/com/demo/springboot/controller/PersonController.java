package com.demo.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.demo.springboot.pojo.CardDetail;
import com.demo.springboot.pojo.CardType;
import com.demo.springboot.pojo.Person;
import com.demo.springboot.pojo.Student;
import com.demo.springboot.respository.PersonRespository;
import com.demo.springboot.service.PersonService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.smartcardio.Card;
import java.util.ArrayList;
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
        List<Student> personList = personService.findAll();
        System.out.println(personList);
        return  JSON.toJSONString(personList);
    }

    @GetMapping(value = "/getCard")
    public String getCard() {
        List<CardType> list=new ArrayList<>();

        CardType cardType = new CardType();
        cardType.setDay("3");
        List<CardDetail> cardDetails=new ArrayList<>();
        CardDetail cardDetail=new CardDetail();
        cardDetail.setName("体验");
        cardDetail.setId("1");
        cardDetails.add(cardDetail);
        cardDetails.add(cardDetail);
        cardType.setCardDetailList(cardDetails);

        CardType cardType2 = new CardType();
        cardType2.setDay("4");
        List<CardDetail> cardDetails2=new ArrayList<>();
        CardDetail cardDetail3=new CardDetail();
        cardDetail3.setName("体验");
        cardDetail3.setId("1");
        cardDetails2.add(cardDetail3);
        cardDetails2.add(cardDetail3);

        cardType2.setCardDetailList(cardDetails2);

        list.add(cardType);
        list.add(cardType2);

        System.out.println(list);
        return  new Gson().toJson(list);
//        return  JSON.toJSONString(list);
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
