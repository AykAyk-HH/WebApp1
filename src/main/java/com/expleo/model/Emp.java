package com.expleo.model;

public class Emp{
	int empno;
	String name;
	float salary;

	
	
	public int getEmpno() {
		return empno;
	}



	public String getName() {
		return name;
	}



	public float getSalary() {
		return salary;
	}



	public void setEmpno(int empno) {
		this.empno = empno;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Emp(){
		
	}

	public Emp(int empno, String name, float salary) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}


}
