package com.capgemini.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.mvc.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController1 {

	@Autowired
	private PersonService service;

	@RequestMapping
	public String inputPage() {
		return "js";
	}

	@RequestMapping("/new")
	public String addNewPerson(@RequestParam("personId") int personId, @RequestParam("personName") String personName) {
		Person person = new Person(personId, personName);
		service.addNew(person);
		System.out.println("123");
		return "success";

	}
}
