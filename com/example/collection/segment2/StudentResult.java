package com.example.collection.segment2;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StudentResult {

	public static void main(String[] args) {
		
		
		System.out.println("WELCOME TO STUDENT RESULT DASHBOARD");
		System.out.println("===================================");
		
		System.out.println(" a) Print the name of students who secure first, second and third position.");
		System.out.println(" b) Print name of those students who’s marks are below 50%.");
		System.out.println(" c) Print name of those students who’s marks are below 35% it means they are fail.");
		System.out.println(" d) Print name of those students who’s marks are above average score." );
		System.out.println(" e) Print detail of all students on the basis of Name");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any option from list:");
		char option = sc.next().charAt(0);
		
		switch (option) {
		case 'a':
			optionA();
			break;
		case 'b':
			optionB();
			break;
		case 'c':
			optionC();
			break;
		case 'd':
		    optionD();
			break;
			
		case 'e':
			optionE();
			break;
			
		default:
			System.out.println("You have entered Wrong option.");
			break;
		}
			
	}
	
	public static void optionA() {
		List<Student> studentList=studentList();
		List<Student> collect = studentList.stream().sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed()).limit(3).collect(Collectors.toList());
		collect.forEach(s->{
			System.out.println(s.getRollno()+" => "+s.getSname()+" => "+" => "+String.format("%.2f", s.getpercentage())+"%");
		});
	}
	
	public static void optionB() {
		List<Student> studentList=studentList();
		List<Student> passStd = studentList.stream().filter(s->((s.getTotalmarks()/500)*100)<50).collect(Collectors.toList());
		passStd.forEach(s->{s.display();});
	}
	
	public static void optionC() {
		List<Student> studentList=studentList();
		List<Student> passStd = studentList.stream().filter(s->((s.getTotalmarks()/500)*100)<35).collect(Collectors.toList());
		passStd.forEach(s->{s.display();});
	}
	
	public static void optionD() {
		List<Student> studentList=studentList();
		List<Student> passStd = studentList.stream().filter(s->(((s.getTotalmarks()/500)*100)>=60) && (((s.getTotalmarks()/500)*100)<=80)).collect(Collectors.toList());
		passStd.forEach(s->{s.display();});
	}
	
	public static void optionE() {
		List<Student> slist=studentList();
    	printStudentList(slist);
	}
	
	public static List<Student> studentList() {
		
		Student s1=new Student();
		s1.setRollno(11);
		s1.setSname("kamal");
		s1.setClassName("3rd Standard");
		s1.setTotalmarks(240.00);
		
		Student s2=new Student();
		s2.setRollno(13);
		s2.setSname("anil");
		s2.setClassName("5th Standard");
		s2.setTotalmarks(229.00);
		
		Student s3=new Student();
		s3.setRollno(12);
		s3.setSname("pratik");
		s3.setClassName("3rd Standard");
		s3.setTotalmarks(150.00);
		
		Student s4=new Student();
		s4.setRollno(17);
		s4.setSname("mandar");
		s4.setClassName("2nd Standard");
		s4.setTotalmarks(121.00);
		
		Student s5=new Student();
		s5.setRollno(15);
		s5.setSname("rajesh");
		s5.setClassName("2nd Standard");
		s5.setTotalmarks(190.00);
		
		
		Student s6=new Student();
		s6.setRollno(16);
		s6.setSname("sunil");
		s6.setClassName("1st Standard");
		s6.setTotalmarks(470.00);
		
		Student s7=new Student();
		s7.setRollno(14);
		s7.setSname("nilesh");
		s7.setClassName("1st Standard");
		s7.setTotalmarks(485.00);
		
		
		Student s8=new Student();
		s8.setRollno(20);
		s8.setSname("akbar");
		s8.setClassName("1st Standard");
		s8.setTotalmarks(330.00);
		
		Student s9=new Student();
		s9.setRollno(10);
		s9.setSname("akash");
		s9.setClassName("1st Standard");
		s9.setTotalmarks(427.00);
		
		List<Student> slist=Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9);
		return slist;
	}
	
	
	public static void printStudentList(List<Student> studentList) {
		studentList.forEach(
				s->{
					System.out.println(s.getSname()+", "+s.getClassName()+", "+s.getTotalmarks());
				}
        );
	}
	
}
