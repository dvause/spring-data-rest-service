package com.dvause.person;

import com.dvause.config.CoreConfig;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.inject.Inject;

/**
 * @author David Vause
 */
@ContextConfiguration(classes = CoreConfig.class)
public class PersonMongoRepositoryTests extends AbstractJUnit4SpringContextTests {

	@Inject
	private PersonMongoRepository repository;

	@Test
	public void testInsertPerson() {
		Person person = new Person("Dave", 42);
		repository.insertPerson(person);

		Person person1 = repository.findPersonByName("Dave");
		System.out.println(person1);
	}
}
