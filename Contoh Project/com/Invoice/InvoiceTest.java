package com.Invoice;
import java.util.Scanner;

class InvoiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insert part mumber      : ");
		String partNumber = scanner.nextLine();
		System.out.print("Insert part description : ");
		String partDesc = scanner.nextLine();
		System.out.print("Enter quantity          : ");
		int quantity = scanner.nextInt();
		System.out.print("Enter price_perItem     : ");
		double price_perItem = scanner.nextDouble();
		scanner.nextLine();
		
		Invoice invoice = new Invoice(partNumber, partDesc, quantity, price_perItem);
		System.out.println("Part number      : " + invoice.getPartNumber());
		System.out.println("Part description : " + invoice.getPartDesc());
		System.out.println("Quantity         : " + invoice.getQuantity());
		System.out.println("Price per item	 : " + invoice.getPrice_perItem());
		System.out.println("Invoice amount	 : " + invoice.getInvoiceAmount());
		System.out.println();
		
		System.out.print("Insert new part mumber      : ");
		invoice.setPartNumber(scanner.nextLine());
		System.out.print("Insert new part description : ");
		invoice.setPartDesc(scanner.nextLine());
		System.out.print("Enter new quantity          : ");
		invoice.setQuantity(scanner.nextInt());
		System.out.print("Enter new price_perItem     : ");
		invoice.setprice_perItem(scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("New part number      : " + invoice.getPartNumber());
		System.out.println("New part description : " + invoice.getPartDesc());
		System.out.println("New Quantity         : " + invoice.getQuantity());
		System.out.println("New price per item   : " + invoice.getPrice_perItem());
		System.out.println("New invoice amount   : " + invoice.getInvoiceAmount());
		
		scanner.close();
	}

}
