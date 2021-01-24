package com.employee.test;
import com.employee.CommissionEmployee;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		
		CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", 
										"222-22-2222", 1000, .25);
		
		System.out.println("Employee information obtained by get methods:\n");
		System.out.printf("First name is %s\n", employee.getFirstName());
		System.out.printf("Last name is %s\n", employee.getLastName());
		System.out.printf("Social security number is %s\n", employee.getSocialSecurityNumber());
		System.out.printf("Gross sales is %.2f\n", employee.getGrossSales());
		System.out.printf("Commission rate is %.2f\n", employee.getCommissionRate());
		System.out.println("Earnings is " + employee.earnings());

		employee.setGrossSales(1000);
		employee.setCommissionrate(0.5);
		
		System.out.println("\nUpdated employee information obtained by toString\n");
		System.out.println(employee.toString());
		System.out.println("Earnings: " + employee.earnings());

	}

}
