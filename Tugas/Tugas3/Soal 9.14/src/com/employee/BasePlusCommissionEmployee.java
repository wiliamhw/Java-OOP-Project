package com.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week
	
	public BasePlusCommissionEmployee() {
		super();
		this.baseSalary = 5000;
	}
	
	// six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) {
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;
	}
	
	// return base salary
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// calculate earnings
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	// return String representation of BasePlisCommissionEmployee
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "Base-salaried", super.toString(), "Base salary", getBaseSalary());
	}
}
