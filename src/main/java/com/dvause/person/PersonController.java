package com.dvause.person;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @author David Vause
 */
@RestController
public class PersonController {
	@Inject
	private PersonMongoRepository repository;

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public Person getPerson() {
		/*Test code insert*/
		Person person = new Person("Dave", 42);
		repository.insertPerson(person);

		return repository.findPersonByName("Dave");
	}
}
