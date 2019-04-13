package com.capgemini.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonImpl implements PersonService{

	@Autowired
	private PersonDao dao;
	
	@Override
	public void addNew(Person person) {
		dao.addNew(person);
		
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int personId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

}
