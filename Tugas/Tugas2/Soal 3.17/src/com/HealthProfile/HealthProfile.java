package com.HealthProfile;

import java.time.LocalDate;
import java.time.Period;

class HealthProfile {
	private String firstName;
	private String lastName;
	private String gender;
	class dateOfBirth {
		private int day;
		private int month;
		private int year;
		
		void setDateOfBirth(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		int[] getDateOfBirth() {
			int tmp[] = {this.day, this.month, this.year};
			return tmp;
		}
	}
	dateOfBirth date = new dateOfBirth();
	private double height; // in inches
	private double weight; // in pounds
	
	HealthProfile(String firstName, String lastName, String gender, int month, 
					int day, int year, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.date.setDateOfBirth(day, month, year);
		this.height = height;
		this.weight = weight;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	void setGender(String gender) {
		this.gender = gender;
	}
	
	void setHeight(int height) {
		this.height = height;
	}
	
	void setWeight(int weight) {
		this.weight = weight;
	}
	
	String getFirstName() {
		return this.firstName;
	}
	
	String getLastName() {
		return this.lastName;
	}
	
	String getGender() {
		return this.gender;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	int getAge() {
		int dateOfBirth[] = date.getDateOfBirth();
		LocalDate past = LocalDate.of(dateOfBirth[2], dateOfBirth[1], dateOfBirth[0]);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(past, now);
		return diff.getYears();
	}
	
	int getMaxHeartRate() {
		return 220 - getAge();
	}
	
	double[] getTargetHeartRateRange() {
		int maxHeartRate = this.getMaxHeartRate();
		double tmp[] = {0.5 * maxHeartRate, 0.85 * maxHeartRate};
		return tmp;
	}
	
	double getBMI() {
		double result = (this.weight * 703) / (this.height * this.height);
		return Math.round(result * 10.0) / 10.0;
	}
}
