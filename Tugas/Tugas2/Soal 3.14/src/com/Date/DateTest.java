package com.Date;
import java.util.Scanner;

class DateTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert month : ");
		int month = scanner.nextInt();
		System.out.print("Insert day   : ");
		int day = scanner.nextInt();
		System.out.print("Insert year  : ");
		int year = scanner.nextInt();
		System.out.println();
		
		Date date = new Date(month, day, year);
		System.out.println("Current month : " + date.getMonth());
		System.out.println("Current day   : " + date.getDay());
		System.out.println("Current year  : " + date.getYear());
		System.out.println();
		
		System.out.print("Insert new month : ");
		date.setMonth(scanner.nextInt());
		System.out.print("Insert new day   : ");
		date.setDay(scanner.nextInt());
		System.out.print("Insert new year  : ");
		date.setYear(scanner.nextInt());
		
		System.out.print("New date: ");
		date.displayDate();
		
		scanner.close();
	}
}
