package com.demo.springboot.pojo;


import lombok.Data;

@Data
public class Greeting {
    private Long id;
    private String name;

    public Greeting(Long id,String name){
        this.id=id;
        this.name=name;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
