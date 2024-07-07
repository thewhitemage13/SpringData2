package com.example.demo;

import com.example.demo.repository.PersonRepository;
import entity.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
@EntityScan(basePackages = "entity")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(PersonRepository repository) {
//		return args -> {
//			Person person = Person.builder()
//					.name("Katye")
//					.surname("Vyacheslavovna")
//					.lastName("efweFWEF")
//					.build();
//
////			repository.save(person);
//
//			for (Person person1 : repository.findAll()) {
//				System.out.println(repository.findAll());
//			}
//		};
//	}

}
