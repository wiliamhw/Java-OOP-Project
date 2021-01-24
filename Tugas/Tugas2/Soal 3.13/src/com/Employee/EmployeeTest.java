package com.Employee;
import java.util.Scanner;

class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert the first employee's first name     : ");
		String firstname = scanner.nextLine();
		System.out.print("Insert the first employee's last name      : ");
		String lastname = scanner.nextLine();
		System.out.print("Insert the first employee's monthly salary : ");
		double monthlysalary = scanner.nextDouble();
		scanner.nextLine();
		
		Employee first = new Employee(firstname, lastname, monthlysalary);
		System.out.println("The first employee's first name     : " + first.getFirstName());
		System.out.println("The first employee's last name      : " + first.getLastName());
		System.out.println("The first employee's monthly salary : " + first.getMonthlySalary());
		System.out.println();
		
		Employee second = new Employee("Carl", "Johnson", 5000);
		System.out.println("The second employee's first name     : " + second.getFirstName());
		System.out.println("The second employee's last name      : " + second.getLastName());
		System.out.println("The second employee's monthly salary : " + second.getMonthlySalary());
		System.out.println();
		
		System.out.println("Every employee get 10% raise in salary");
		first.setMonthlySalary(first.getMonthlySalary() * 1.1);
		second.setMonthlySalary(second.getMonthlySalary() * 1.1);
		System.out.println("The first employee's new salary  : " + first.getMonthlySalary());
		System.out.println("The second employee's new salary : " + second.getMonthlySalary());
		
		
		scanner.close();
	}

}
