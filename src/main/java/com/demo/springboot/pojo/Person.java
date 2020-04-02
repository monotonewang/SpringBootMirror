package com.demo.springboot.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by wang on 17-4-9.
 * 本类中属性
 * ConfigurationProperties 批量注入属性
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Entity
public class Person {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Value("1") 松散绑定
    private Long id;
    private String name;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> map;
    private List<Object> lists;
//    private Dog dog;

    protected Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Long id, Integer age, String name) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
