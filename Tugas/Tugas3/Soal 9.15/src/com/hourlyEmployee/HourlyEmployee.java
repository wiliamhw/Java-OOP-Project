package com.hourlyEmployee;

public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;
	
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours < 0 || hours > 168) {
			throw new IllegalArgumentException("Hours can't exceed maximum hours per week");
		}
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Wage must be non-negative");
		}
		this.wage = wage;
	}

	public HourlyEmployee() {
		super();
		this.wage = 25;
		this.hours = 8;
	}
	
	public HourlyEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double wage, double hours) {
		
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	
	public double earnings() {
		double earning = this.hours * this.wage;
		if (hours > 40) earning *= 1.5;
		return earning;
	}
	
	public String toString() {
		return String.format("%s%s: %.2f%n%s: %.2f", super.toString(), "Hours", 
				getHours(), "Wage", getWage());
	}
}
