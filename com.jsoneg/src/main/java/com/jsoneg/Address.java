package com.jsoneg;

public class Address {

	
	private String street;
	
	private String city;
	
	private long postcode;



	public Address() {
		super();
		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}



	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postcode=" + postcode + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPostcode() {
		return postcode;
	}

	public void setPostcode(long postcode) {
		this.postcode = postcode;
	}



	public Address(String street, String city, long postcode) {
		super();
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}


	
	
}
