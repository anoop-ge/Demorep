package com.jsoneg;

public class Person {

	
	private String Name;
	private Integer agee;
	private Address address;
	public Person(String name, Integer age, Address address) {
		super();
		this.Name = name;
		this.agee = age;
		this.address = address;
	}
	
	public Person() {
		super();
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return agee;
	}
	public void setAge(Integer age) {
		this.agee = age;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + agee + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
}
