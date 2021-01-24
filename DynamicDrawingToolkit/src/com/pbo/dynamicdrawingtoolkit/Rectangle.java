package com.pbo.dynamicdrawingtoolkit;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends DrawingObjectBounds {
	private int rectWidth, rectHeight;

	public Rectangle() {
		super();
	}

	public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean fill) {
		super(x1, y1, x2, y2, color, fill);
	}

	@Override
	public void draw(Graphics g) {
		rectWidth = getWidth();
		rectHeight = getHeight();

		g.drawRect(getUpperLeftX(), getUpperLeftY(), rectWidth, rectHeight);
	}
	
	public boolean contain(int x, int y) {
		if (super.getUpperLeftX() <= x && x <= super.getLowerRightX() &&
			super.getUpperLeftY() <= y && y <= super.getLowerRightY()) {
			return true;
		}
		
		return false;
	}
	
	// contain(x, y)
	// 1. xMin <= x <= xMax
	// 2. yMin <= y <= yMax
}
