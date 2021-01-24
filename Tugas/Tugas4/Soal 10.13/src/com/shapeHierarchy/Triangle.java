package com.shapeHierarchy;

public class Triangle extends TwoDimensionalShape {
	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		this.base = base;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	@Override
	public double getArea() {
		return this.base * this.height / 2;
	}
}
