package com.pbo.dynamicdrawingtoolkit;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends DrawingObject {
	public Line() {
		super();
	}

	public Line(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, x2, y2, color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getX1(), getY1(), getX2(), getY2());
	}
	
	public boolean contain(int x, int y) {
		int xShape[] = new int[2]; // index 0 = min, index 1 = max
		xShape[0] = Math.min(super.getX2(), super.getX1());
		xShape[1] = Math.max(super.getX2(), super.getX1());
		
		int yShape[] = new int[2]; // index 0 = min, index 1 = max
		yShape[0] = Math.min(super.getY2(), super.getY1());
		yShape[1] = Math.max(super.getY2(), super.getY1());
		
		// tidak terletak di range x dan y
		if (!(xShape[0] <= x && x <= xShape[1] && yShape[0] <= y && y <= yShape[1])) {
			return false;
		}
		
		int dx = xShape[1] - xShape[0];
		int dy = yShape[1] - yShape[0];
		double m = dy/dx;
		
		int Idx = xShape[1] - x;
		int Idy = yShape[1] - y;
		double Im = Idy/Idx;
		
		// gradien tidak sama
		if (Math.abs(m - Im) > 0.0001) {
			return false;
		}
		
		return true;
	}
}
