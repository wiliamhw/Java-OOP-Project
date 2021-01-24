package com.Invoice;

class Invoice {
	private String partNumber;
	private String partDesc;
	private int quantity;
	private double price_perItem;
		
	Invoice(String partNumber, String partDesc, int quantity, double price_perItem) {
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price_perItem = price_perItem;
	}
	
	void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void setprice_perItem(double price_perItem) {
		this.price_perItem = price_perItem;
	}
	
	String getPartNumber() {
		return this.partNumber;
	}
	
	String getPartDesc() {
		return this.partDesc;
	}
	
	int getQuantity() {
		return this.quantity;
	}
	
	double getPrice_perItem() {
		return this.price_perItem;
	}
	
	double getInvoiceAmount() {
		if (price_perItem < 0) this.price_perItem = 0.0;
		double result = this.quantity * this.price_perItem;
		if (result < 0) result = 0;
		return result;
	}

}
