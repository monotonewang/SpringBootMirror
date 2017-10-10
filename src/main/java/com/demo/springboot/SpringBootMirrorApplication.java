package com.demo.springboot;

import com.demo.springboot.pojo.Person;
import com.demo.springboot.respository.PersonRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootMirrorApplication {

	/**
	 * start spring boot
	 * under SpringBootMirror foler
	 * input "SpringBootMirror mvn spring-boot:run"
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMirrorApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(SpringBootMirrorApplication.class);

//	@Bean
//	public CommandLineRunner demo(PersonRespository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Person("Jack", 1));
//			repository.save(new Person("Chloe", 1));
//			repository.save(new Person("Kim", 12));
//			repository.save(new Person("David", 31));
//			repository.save(new Person("Michelle", 45));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Person customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Person customer = repository.findOne(1L);
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Jack'):");
//			log.info("--------------------------------------------");
//			for (Person bauer : repository.findByName("Jack")) {
//				log.info(bauer.toString());
//			}
//			log.info("");
//		};
//	}
}
