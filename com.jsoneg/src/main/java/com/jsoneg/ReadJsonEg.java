package com.jsoneg;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJsonEg {
	
	public static void main(String[] args) throws Exception {
		


		ObjectMapper obj=new ObjectMapper();

		FileInputStream fis=new FileInputStream("./person.json");
		
		
		Person person=obj.readValue(fis, Person.class);
		
		System.out.println(person);
	}}
