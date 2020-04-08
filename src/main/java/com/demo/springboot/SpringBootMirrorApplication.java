package com.demo.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//部署
//sudo mvn package && java -jar target/gs-spring-boot-0.1.0.jar

//查看和强制杀掉进程 8080
// lsof -i: 8080
//sudo kill  -9   12345


/**
 * 保存用户每次登陆系统的时间
 */
//导入spring配置文件。让配置文件内容生效
@MapperScan("com.demo.springboot.mapper")
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBootMirrorApplication {

	public SpringBootMirrorApplication() {
	}

	/**
	 * start spring boot
	 * under SpringBootMirror foler
	 * input "SpringBootMirror mvn spring-boot:run"
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMirrorApplication.class, args);
	}

//	private static final Logger log = LoggerFactory.getLogger(SpringBootMirrorApplication.class);

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
