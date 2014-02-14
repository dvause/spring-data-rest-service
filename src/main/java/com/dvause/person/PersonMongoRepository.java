package com.dvause.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


/**
 * @author David Vause
 */
@Repository
public class PersonMongoRepository {
	@Autowired
	private MongoOperations mongoTemplate;

	public void insertPerson(Person person) {
		mongoTemplate.insert(person);
	}

	public Person findPersonByName(String name) {
		Query query = new Query(Criteria.where("name").is(name));
		return mongoTemplate.findOne(query, Person.class);
	}

}
