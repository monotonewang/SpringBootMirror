package com.demo.springboot.respository;

import com.demo.springboot.pojo.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by wang on 17-4-9.
 */
public interface PersonRespository extends CrudRepository<Student, Long> {

//    import org.springframework.data.jpa.repository.JpaRepository;


    List<Student> findByName(String lastName);


}
