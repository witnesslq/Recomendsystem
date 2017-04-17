package com.hxy.service;

import com.hxy.model.Person;

public interface PersonService {
	 void save(Person person);    
	    void del(Person person);    
	    void update(Person person);    
	    void searchAll();  
}
