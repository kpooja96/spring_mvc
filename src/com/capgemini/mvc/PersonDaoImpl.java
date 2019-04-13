package com.capgemini.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements PersonDao{
	
	@Autowired
	private JdbcTemplate template;
		
		

		
		public void addNew(Person person) {
			
			template.update("insert into person values(?,?)",
					new Object[] {person.getPersonnId(),person.getPersonName()});
			
		}
	/*
	 * @Override List<Person> getAll() { return null; }
	 */




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


