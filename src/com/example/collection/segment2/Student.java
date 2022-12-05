package com.example.collection.segment2;

public class Student {

	private Integer rollno;
	private String sname;
	private String className;
	private Double totalmarks;

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Double getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(Double totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", className=" + className + ", totalmarks="
				+ totalmarks + "]";
	}

}
