package com.demo.springboot.pojo;

import lombok.Data;
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
 * 告诉springboot将本类中的所有属性和配置文件中的相关配置进行绑定
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Entity
@Data
public class Person {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Value("1") 松散绑定 一个一个注入
    private Long id;

    private String name;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private Boolean boss;
    private Date birth;
    private Map<String, Object> map;
    private List<Object> lists;
    private Dog dog;

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

}
