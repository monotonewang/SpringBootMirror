package com.demo.springboot.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//加载指定的配置文件
@PropertySource(value = {"classpath:person_property.properties"})
@Data
@Component
@ConfigurationProperties(prefix = "personalpropertysource")
public class Personal_PropertySource {
    private String country;

}
