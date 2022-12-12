package com.example.oops.q09;

public class PTest {

	public static void main(String[] args) {

		Person p1 = new Person(1, "abc");
		Person p2 = new Person(2, "mno");
		Person p3 = new Person(3, "xyz");
		Person p4 = new Person(4, "pqr");
		Person p5 = new Person(5, "stu");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

		// Assign obj 1 as null for collecting by gc
		p2 = null;
		p1 = null;
		p5 = null;

		// calling garbage collector
		System.gc();

		System.out.println("Total created Object:" + Person.countCreatedObj);
		System.out.println("Total Destroyed Object:" + Person.countDestroyedObj);
	}

}
