//package com.demo.springboot.controller;
//
//import com.demo.springboot.properties.PersonProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.*;
//
///**
// * Created by wang on 17-4-9.
// */
////@RestController =@Controller+@ResponseBody
//@RestController
//public class SpringBootController {
//
//    @Value("${height}")
//    private String height;
//
////    http://localhost:8082/SpringBoot/hello/23
//    @RequestMapping(value="/hello/{id}",method= RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id){
//        return "Hello Spring Boot"+id;
//    }
//
////    http://localhost:8082/SpringBoot/hello/?id=23
////    @RequestMapping(value="/hello",method= RequestMethod.GET)
//    @GetMapping(value = "/hello")
//    public String getParam(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
//        return "Hello Spring Boot="+id;
//    }
//
//
//    /**
//     * single param
//     * @return
//     */
//    @RequestMapping(value="/getHeight",method= RequestMethod.GET)
//    public String getHeight(){
////        return height;
//        return personProperties.getName();
//    }
//
//    //use bean get properties
//    @Autowired
//    private PersonProperties personProperties;
//
//    @RequestMapping(value = "/getHtml",method = RequestMethod.GET)
//    public String getHtml(){
//        return "SpringBoot";
//    }
//}
