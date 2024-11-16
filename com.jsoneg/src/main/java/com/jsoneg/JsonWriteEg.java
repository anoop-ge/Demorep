package com.jsoneg;
import java.util.*;

import java.io.*;




import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriteEg {
	


	
public static void main (String[] args) throws Exception {
	
	Address addr=new Address("street","city",2342);
		
Person person=new Person("Name",23,addr);

//person.setAge(80);

//person.setName("Test");

	FileOutputStream fos=new FileOutputStream("person.json");
	
	ObjectMapper mapper=new ObjectMapper();
	
	
	mapper.writeValue(fos, person);
		
		
	}
	

}
