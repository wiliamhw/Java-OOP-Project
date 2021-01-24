package com.hourlyEmployee;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee employee = new HourlyEmployee("Sue", "Jones", 
				"222-22-2222", 25, 80);
		
		System.out.println("Employee information obtained by get methods:\n");
		System.out.printf("First name is %s\n", employee.getFirstName());
		System.out.printf("Last name is %s\n", employee.getLastName());
		System.out.printf("Social security number is %s\n", employee.getSocialSecurityNumber());
		System.out.printf("Hours is %.2f\n", employee.getHours());
		System.out.printf("Wage is %.2f\n", employee.getWage());
		System.out.println("Earnings is " + employee.earnings());
		
		employee.setHours(30);
		employee.setWage(10);
		
		System.out.println("\nUpdated employee information obtained by toString\n");
		System.out.println(employee.toString());
		System.out.println("Earnings: " + employee.earnings());
	}

}
