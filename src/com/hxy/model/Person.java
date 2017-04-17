package com.hxy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	
	private long id;
	@NotNull
	@Size(min=3,max=20,message="name must between 3 and 20!")
	private String name;
	
	private int age;
	
	private String gender;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Person(){
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
