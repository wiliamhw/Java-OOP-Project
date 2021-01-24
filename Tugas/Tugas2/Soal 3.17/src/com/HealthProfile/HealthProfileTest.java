package com.HealthProfile;

import java.util.Scanner;

class HealthProfileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert first name: ");
		String firstName = scanner.nextLine();
		System.out.print("Insert last name : ");
		String lastName = scanner.nextLine();
		System.out.print("Insert gender    : ");
		String gender = scanner.nextLine();
		System.out.print("Insert date of birth (DD MM YYYY): ");
		int day = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Insert height    : ");
		double height = scanner.nextDouble();
		System.out.print("Insert weight    : ");
		double weight = scanner.nextDouble();
		
		HealthProfile profile = new HealthProfile(firstName, lastName,
				gender, month, day, year, height, weight);
		
		System.out.println("\nFirst name        : " + profile.getFirstName());
		System.out.println("Last name         : " + profile.getLastName());
		System.out.println("Gender            : " + profile.getGender());
		int date[] = profile.date.getDateOfBirth();
		System.out.println("Date of birth     : " + date[0]+ "-" + date[1] + "-" + date[2]);
		System.out.println("Height            : " + profile.getHeight());
		System.out.println("Weight            : " + profile.getWeight());
		System.out.println("Age               : " + profile.getAge());
		System.out.println("BMI values        : " + profile.getBMI());
		System.out.println("Maximum heart rate: " + profile.getMaxHeartRate());
		double range[] = profile.getTargetHeartRateRange();
		System.out.println("Target heart rate : " + range[0] + " - " + range[1]);
		
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal     : between 18.5 and 24.9");
		System.out.println("Overweight : between 25 and 29.9");
		System.out.println("Obese      : 30 or greater");
		
		scanner.close();
	}

}
