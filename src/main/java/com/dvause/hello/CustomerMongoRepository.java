package com.dvause.hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author David Vause
 */
@Repository
public interface CustomerMongoRepository extends MongoRepository<Customer, String> {
	public List<Customer> findByFirstName(String firstName);
	public List<Customer> findByLastName(String lastName);
}
