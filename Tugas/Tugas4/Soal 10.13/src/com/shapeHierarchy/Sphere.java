package com.shapeHierarchy;

public class Sphere extends ThreeDimensionalShape {
	private double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public double getVolume() {
		return (double)4/ (double)3 * Math.PI * Math.pow(radius, 3);
	}
}
