package com.example.oops.q09;

public class Person {
    
	static int countDestroyedObj;
	static int countCreatedObj;
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		countCreatedObj++;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	public void finalize() {
		countDestroyedObj++;
	}

	public static int totalCreatedObj() {
		return countCreatedObj;
	}
	
	public static int totalDestroyedObj() {
		return countDestroyedObj;
	}
}
