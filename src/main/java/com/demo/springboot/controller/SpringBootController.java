package com.demo.springboot.controller;

import com.demo.springboot.properties.PersonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang on 17-4-9.
 */
@RestController
public class SpringBootController {

    @Value("${height}")
    private String height;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot";
//        return height;
    }

    /**
     * single param
     * @return
     */
    @RequestMapping(value="/getHeight",method= RequestMethod.GET)
    public String getHeight(){
//        return height;
        return personProperties.getName();
    }

    @Autowired
    private PersonProperties personProperties;
}
