package com.capgemini.mvc;

import java.util.List;

import com.capgemini.mvc.Person;
public interface PersonService {
	
	void addNew(Person person);
	List<Person> getAll();
	void update(Person person);
	void delete(int personId);
	Person getPerson(int personId);
	
}
