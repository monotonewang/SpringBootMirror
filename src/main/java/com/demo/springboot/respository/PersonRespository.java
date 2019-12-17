package com.demo.springboot.respository;

import com.demo.springboot.pojo.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by wang on 17-4-9.
 */
public interface PersonRespository extends CrudRepository<Person, Long> {

//    import org.springframework.data.jpa.repository.JpaRepository;


    List<Person> findByName(String lastName);


}
