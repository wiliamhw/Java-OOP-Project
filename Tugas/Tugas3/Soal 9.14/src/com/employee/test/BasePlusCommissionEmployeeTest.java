package com.employee.test;
import com.employee.BasePlusCommissionEmployee;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {	
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Sue", "Jones", 
										"222-22-2222", 100, .25, 5000);
		
		System.out.println("Employee information obtained by get methods:\n");
		System.out.printf("First name is %s\n", employee.getFirstName());
		System.out.printf("Last name is %s\n", employee.getLastName());
		System.out.printf("Social security number is %s\n", employee.getSocialSecurityNumber());
		System.out.printf("Gross sales is %.2f\n", employee.getGrossSales());
		System.out.printf("Commission rate is %.2f\n", employee.getCommissionRate());
		System.out.printf("Base salary is %.2f\n", employee.getBaseSalary());
		System.out.println("Earnings is " + employee.earnings());

		employee.setBaseSalary(10000);
		employee.setCommissionrate(0.5);
		employee.setGrossSales(1000);
		
		System.out.println("\nUpdated employee information obtained by toString\n");
		System.out.println(employee.toString());
		System.out.println("Earnings: " + employee.earnings());
		
	}

}
