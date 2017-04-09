package com.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang on 17-4-9.
 */
@RestController
public class SpringBootController {

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot";
    }
}
