package com.shapeHierarchy;

public class Square extends TwoDimensionalShape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.side, 2);
	}
}
