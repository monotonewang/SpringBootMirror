package com.demo.springboot.respository;

import com.demo.springboot.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wang on 17-4-9.
 */
public interface PersonRespository extends JpaRepository<Person,Integer> {
}
