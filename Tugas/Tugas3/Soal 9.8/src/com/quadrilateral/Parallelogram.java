package com.quadrilateral;

public class Parallelogram extends Quadrilateral {

	public Parallelogram() {
		super(new Point(0, 0), new Point(1, 1), new Point(4, 1), new Point(3, 0));
	}

	public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
    	super(point1, point2, point3, point4);
    }
	
	private double height = super.getPoint3().getY() - super.getPoint1().getY();
	
	private boolean isParallelogram() {
        if (super.slope12 == super.slope34 && super.slope14 == super.slope23 && 
        	super.line[0] == super.line[2] && super.line[3] == super.line[1]) {
            return true;
        }
        return false;
	}
	
    @ Override
	public double getArea() {
    	if (!isParallelogram()) {
			throw new IllegalArgumentException("Points do not form parallelogram.");
		}
    	System.out.print("Parallelogram area: ");
		return Math.abs(super.line[1] * this.height);
	}

}
