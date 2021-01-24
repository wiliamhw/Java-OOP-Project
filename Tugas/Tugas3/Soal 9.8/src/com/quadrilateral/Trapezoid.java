package com.quadrilateral;

public class Trapezoid extends Quadrilateral {

	public Trapezoid() {
		super(new Point(0, 0), new Point(6, 0), new Point(4, 1), new Point(2, 1));
	}

	public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
    	super(point1, point2, point3, point4);
    }
	
	private double height = super.getPoint3().getY() - super.getPoint1().getY();
	
    @ Override
	public double getArea() {
        if (super.slope12 == super.slope34) {
            return _getArea(super.line[0], super.line[2]);
        }
        if (super.slope14 == super.slope23) {
        	return _getArea(super.line[3], super.line[1]);
        }
        throw new IllegalArgumentException("Points do not form trapezoid.");
	}

    private double _getArea(double line1, double line2) {
    	System.out.print("Trapezoid area: ");
    	return Math.abs((line1 + line2)/2 * height);
    }

}
