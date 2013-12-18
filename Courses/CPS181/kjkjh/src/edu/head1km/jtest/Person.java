package edu.head1km.jtest;

public class Person {
	//fields
	private String name;
	private int maxAge;
	
	//constructor
	public Person(){
		name = "unknown";
		maxAge = 114;
		
	}
//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
}
