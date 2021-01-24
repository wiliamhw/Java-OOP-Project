package com.quadrilateral;

public class Square extends Quadrilateral {
    public Square() {
    	super(new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 0));
    }
	
    public Square(Point point1, Point point2, Point point3, Point point4) {
    	super(point1, point2, point3, point4);
    }
    
	private boolean isSquare() {
		if (super.slope12 == super.slope34 && super.slope14 == super.slope23 
			&& super.line[0] == super.line[2] && super.line[3] == super.line[1]
			&& super.line[0] == super.line[1] && super.line[3] == super.line[2])
			return true;
		else return false;
	}
    
    @ Override
	public double getArea() {
    	if (!isSquare()) {
    		throw new IllegalArgumentException("Points do not form square.");
    	}
    	System.out.print("Square area: ");
		return Math.pow(super.line[0], 2);
	}
}
