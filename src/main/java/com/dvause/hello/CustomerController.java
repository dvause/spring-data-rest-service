package com.dvause.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author David Vause
 */
@RestController
@RequestMapping(value = "customer")
public class CustomerController {

	@Autowired
	private CustomerMongoRepository repository;

	public List<Customer> getCustomers(@RequestParam(value="firstName", required=false) String firstName,
									   @RequestParam(value = "lastName", required = false) String lastName) {
		if (firstName != null) {
			return repository.findByFirstName(firstName);
		} else if (lastName != null) {
			return repository.findByLastName(lastName);
		} else {
			return repository.findAll();
		}
	}

	@RequestMapping(value = "/new")
	public Customer save(
			@RequestParam(value="firstName", required=true) String firstName,
			@RequestParam(value = "lastName", required = true) String lastName) {
		return repository.save(new Customer(firstName, lastName));
	}

}
