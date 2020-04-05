package com.demo.springboot.config;

import com.demo.springboot.service.CardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  指明当前类是一个配置类 用来替代之前的spring 配置文件
 *  <bean></bean>
 */
@Configuration
public class MyAppConfig {

    /**
     * id 就是方法名
     * @return
     */
    @Bean
    public CardService cardService(){
        System.out.println("run cardService method");
        return new CardService();
    }

}
