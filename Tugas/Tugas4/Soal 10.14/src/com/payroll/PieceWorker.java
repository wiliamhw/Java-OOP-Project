package com.payroll;

public class PieceWorker extends Employee {
	private double wage; // wage per piece
	private int pieces; // pieces produced

	public PieceWorker(String firstName, String lastName, 
			String socialSecurityNumber, double wage, int pieces) {
		
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	
	@Override
	public double earnings() {
		return this.wage * this.pieces;
	}

	// return String representation of PieceWorker object
	@Override
	public String toString() {
		return String.format("piece worker: %s%n%s: $%.2f; %s: %d", 
				super.toString(), "wage per piece", this.getWage(),
				"pieces produced", this.getPieces());
	}
	
}
