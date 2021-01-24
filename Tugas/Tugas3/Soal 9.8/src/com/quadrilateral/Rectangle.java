package com.quadrilateral;

public class Rectangle extends Quadrilateral {

	public Rectangle() {
		super(new Point(0, 0), new Point(0, 1), new Point(4, 1), new Point(4, 0));
	}

	public Rectangle(Point point1, Point point2, Point point3, Point point4) {
    	super(point1, point2, point3, point4);
    }

	private boolean isRectangle() {
		if (super.slope12 == super.slope34 && super.slope14 == super.slope23 
			&& super.line[0] == super.line[2] && super.line[3] == super.line[1])
			return true;
		else return false;
	}
	
    @ Override
	public double getArea() {
    	if (!isRectangle()) {
    		throw new IllegalArgumentException("Points do not form rectangle.");
    	}
    	System.out.print("Rectangle area: ");
		return Math.abs(super.line[0] * super.line[1]);
	}
	
}
