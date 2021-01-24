package com.Date;

class Date {
	private int month;
	private int day;
	private int year;
	
	Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	void setMonth(int month) {
		this.month = month;
	}
	
	void setDay(int day) {
		this.day = day;
	}
	
	void setYear(int year) {
		this.year = year;
	}
	
	int getMonth() {
		return this.month;
	}
	
	int getDay() {
		return this.day;
	}
	
	int getYear() {
		return this.year;
	}
	
	void displayDate() {
		System.out.println(this.month + "/" + this.day + "/" + this.year);
	}
}
