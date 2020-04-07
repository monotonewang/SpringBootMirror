package com.demo.springboot.controller;

import com.demo.springboot.pojo.Greeting;
import com.demo.springboot.pojo.Personal_PropertySource;
import com.demo.springboot.properties.PersonProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wang on 17-4-9.
 */
//@RestController =@Controller+@ResponseBody
@RestController
public class SpringBootController {

    private final AtomicLong atomicLong=new AtomicLong();

    Logger logger = LoggerFactory.getLogger(SpringBootController.class);

    @Autowired
    Personal_PropertySource personal_propertySource;

    @GetMapping(value = "logging")
    public void getLogging(){
        //slf4j使用
        logger.info("SpringBootController info");
        logger.warn("SpringBootController warn");
        logger.error("SpringBootController error");
        logger.debug("SpringBootController debug");
        logger.trace("SpringBootController trace");

    }
    @Value("${height}")
    private String height;

//    http://localhost:8082/SpringBoot/hello/23
    @RequestMapping(value="/hello/{id}",method= RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "Hello Spring Boot"+personal_propertySource.getCountry()+id;
    }

//    http://localhost:8082/SpringBoot/hello/?id=23
//    @RequestMapping(value="/hello",method= RequestMethod.GET)
    @GetMapping(value = "/hello")
    public Greeting getParam(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        return new Greeting(atomicLong.incrementAndGet(), "Hello Spring Boot="+id);
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

    //use bean get properties
    @Autowired
    private PersonProperties personProperties;

    @RequestMapping(value = "/getHtml",method = RequestMethod.GET)
    public String getHtml(){
        return "SpringBoot";
    }
}
