package com.hourlyEmployee;

public class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public Employee() {
		this.firstName = "Johny";
		this.lastName = "Template";
		this.socialSecurityNumber = "177013323026";
	}

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n", "Commission employee", getFirstName(), 
				getLastName(), "Social security number", getSocialSecurityNumber());
	}
}
