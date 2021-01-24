package com.quadrilateral;

class Point {
	private double x;
	private double y;
	
	Point() {
		this(0.0, 0.0);
	}
	
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return x;
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	double getY() {
		return y;
	}
	
	void setY(double y) {
		this.y = y;
	}
}
