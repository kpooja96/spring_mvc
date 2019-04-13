package com.capgemini.mvc;

import java.util.List;

public interface PersonDao {

	void addNew(Person person);
	List<Person> getAll();
	void update(Person person);
	void delete(int personId);
	Person getPerson(int personId);
}
