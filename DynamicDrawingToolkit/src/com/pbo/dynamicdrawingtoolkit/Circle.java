package com.pbo.dynamicdrawingtoolkit;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends DrawingObjectBounds {
	private int circleWidth, circleHeight;

	public Circle() {
		super();
	}

	public Circle(int x1, int y1, int x2, int y2, Color color, boolean fill) {
		super(x1, y1, x2, y2, color, fill);
	}

	@Override
	public void draw(Graphics g) {
		circleWidth = getWidth();
		circleHeight = getHeight();
		circleWidth = circleHeight;

		g.drawOval(getUpperLeftX(), getUpperLeftY(), circleWidth, circleHeight);
	}
	
	public boolean contain(int x, int y) {
		int R = circleWidth/2;
		int dx = x - (getUpperLeftX() + R);
		int dy = y - (getUpperLeftY() + R);

		if (x >= 0 && y >= 0 && Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)) <= R) {
			return true;
		}
		return false;
	}

	// contain(x, y)
	// 1. sqrt((x-O.x)^2, (y-O.y)^2) <= Radius
}
