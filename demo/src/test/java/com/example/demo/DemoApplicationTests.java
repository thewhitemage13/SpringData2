package com.example.demo;

import com.example.demo.repository.PersonRepository;
import entity.Person;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Conditional;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private EntityManager entityManager;

	@Test
	void contextLoads() {

		Person person = Person.builder()
				.lastName("Irina")
				.surname("Metrofanov")
				.name("Petrovich")
				.build();

		entityManager.persist(person);

		System.out.println(entityManager.find(Person.class, person.getId()));
	}

}
