package com.demo.springboot.controller;

import com.demo.springboot.pojo.Course;
import com.demo.springboot.pojo.Person;
import com.demo.springboot.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


/**
 * fuqingwang
 * 2020年04月08日10:43:21
 */
@RestController
@RequestMapping(path = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    Logger logger = LoggerFactory.getLogger(PersonController.class);

    @GetMapping(value = "/insert")
    public String insertPersons(@RequestParam("name") String name) {
        logger.info("course name=" + name);
        if (StringUtils.isEmpty(name))
            return "error";
        courseService.insert(name);
        return "Saved";
    }
}
