package com.demo.springboot.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
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

    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2, max = 8, message = "姓名长度必须大于 2 且小于 20 字")
    private String name;
//    @Value("#{11*2}")
    @NotNull(message = "年龄不能不为空")
    @Min(value=0,message="年龄必须大于0")
    @Max(value=300,message="年龄不大于300")
    private Integer age;
    @Value("true")
    private Boolean boss;
    private Date birth;
    private Map<String, Object> map;
    private List<Object> lists;
    private Dog dog;


    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

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
