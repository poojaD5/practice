package com.postdemo;

public class Student {
	private Integer id;
	private String name;
	private double cgpa;
		
	public Student(Integer id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public double getCgpa() {
		return cgpa;
	}

	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	

	
	
}
