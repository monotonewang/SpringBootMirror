package com.demo.springboot;

import com.demo.springboot.pojo.Person;
import com.demo.springboot.pojo.Personal_PropertySource;
import com.demo.springboot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMirrorApplicationTests {

    @Autowired
    Person person;
    @Autowired
    Personal_PropertySource personal_propertySource;

    @Autowired
    ApplicationContext applicationContext;

    /**
     * 判断是否有helloService
     */
    @Test
    public void testHelloService(){
        boolean isHaveService=applicationContext.containsBean("helloService");
        boolean isHaveCardService=applicationContext.containsBean("cardService");
        System.out.println("isHaveService="+isHaveService);
        System.out.println("isHaveCardService="+isHaveCardService);
    }


    @Test
    public void contextLoads() {
        System.out.println("contextLoads");
        System.out.println(person);
        System.out.println(personal_propertySource);
    }

}
