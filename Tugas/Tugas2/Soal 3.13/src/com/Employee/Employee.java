package com.Employee;

class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	void setMonthlySalary(double monthlySalary) {
		if (monthlySalary < 0) return;
		this.monthlySalary = monthlySalary;
	}
	
	String getFirstName() {
		return this.firstName;
	}
	
	String getLastName() {
		return this.lastName;
	}
	
	double getMonthlySalary() {
		return this.monthlySalary;
	}

}
