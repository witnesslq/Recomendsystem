package com.hxy.service;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hxy.model.Person;


public class PersonServiceImp implements PersonService {

	private JdbcTemplate jdbcTemplate; 
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(Person person) {
		jdbcTemplate.update("insert into person (name,age,gender) values(?,?,?)",person.getName(),person.getAge(),person.getGender());
	}

	@Override
	public void del(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchAll() {
		// TODO Auto-generated method stub
		
	}
}
