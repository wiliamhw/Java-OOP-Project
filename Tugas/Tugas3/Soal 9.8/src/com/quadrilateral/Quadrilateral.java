package com.quadrilateral;

public class Quadrilateral {
	private Point[] point = new Point[4]; // (x,y) coordinate
    protected double[] line = new double[4];
    double slope12, slope34, slope14, slope23;
    
    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
    	this.point[0] = point1;
    	this.point[1] = point2;
    	this.point[2] = point3;
    	this.point[3] = point4;
    	this.setLine();
    	this.setSlope();
    }
    
    public Point getPoint1() {
		return point[0];
	}
	
    public void setPoint1(Point point1) {
		this.point[0] = point1;
	}
	
    public Point getPoint2() {
		return point[1];
	}
	
    public void setPoint2(Point point2) {
		this.point[1] = point2;
	}
	
    public Point getPoint3() {
		return point[2];
	}
	
    public void setPoint3(Point point3) {
		this.point[2] = point3;
	}
	
    public Point getPoint4() {
		return point[3];
	}
	
    public void setPoint4(Point point4) {
		this.point[3] = point4;
	}
    
    public void setLine() {
    	double[] line = new double[4];
    	
    	for (int i = 0; i < 4; i++) {
    		int j = (i != 3) ? i + 1 : 0;
    		double diffX = this.point[j].getX() - this.point[i].getX();
    		double diffY = this.point[j].getY() - this.point[i].getY();
    		line[i] = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    	}
    	this.line = line;
    }
    
    public double[] getLine() {
    	return this.line;
    }

    public double getSlope12() {
		return slope12;
	}

    public double getSlope34() {
		return slope34;
	}

    public double getSlope14() {
		return slope14;
	}

    public double getSlope23() {
		return slope23;
	}

    public void setPoint(Point[] point) {
		this.point = point;
	}

    public void setLine(double[] line) {
		this.line = line;
	}

	public double getArea() {
		System.out.println("Warning: getArea isn't overidden.");
    	return 0.0;
    }
    
    private void setSlope() {
		this.slope12 = _setSlope(getPoint1(), getPoint2());
        this.slope34 = _setSlope(getPoint3(), getPoint4());
        this.slope14 = _setSlope(getPoint1(), getPoint4());
        this.slope23 = _setSlope(getPoint2(), getPoint3());
    }
    
	protected double _setSlope(Point point1, Point point2) {
		double d_y = Math.abs(point1.getY() - point2.getY());
		double d_x = Math.abs(point1.getX() - point2.getX());
		return d_y/d_x;
	}
}
