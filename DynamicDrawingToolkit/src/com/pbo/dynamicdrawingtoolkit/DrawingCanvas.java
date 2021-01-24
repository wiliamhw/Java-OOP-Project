package com.pbo.dynamicdrawingtoolkit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingCanvas extends JPanel {
	private ArrayList<DrawingObject> myShapes;
	private int currentShapeType;
	private DrawingObject currentShapeObject;
	private Color currentShapeColor;

	JLabel statusLabel;

	public DrawingCanvas(JLabel statusLabel) {
		myShapes = new ArrayList<DrawingObject>();
		currentShapeType = 0;
		currentShapeObject = null;
		currentShapeColor = Color.BLACK;

		this.statusLabel = statusLabel;
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		add(statusLabel, BorderLayout.SOUTH);

		MouseHandler handler = new MouseHandler();
		addMouseListener(handler);
		addMouseMotionListener(handler);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int counter = myShapes.size() - 1; counter >= 0; counter--)
			myShapes.get(counter).draw(g);

		if (currentShapeObject != null)
			currentShapeObject.draw(g);
	}

	public void setCurrentShapeType(int type) {
		currentShapeType = type;
	}

	public void clearDrawing() {
		myShapes.clear();
		repaint();
	}

	private class MouseHandler extends MouseAdapter {
		private boolean movable = false;
		private int O[] = new int[2];
		private int O1_[] = new int[2];
		private int O2_[] = new int[2];
		
		public void mousePressed(MouseEvent event) {
			for (DrawingObject obj : myShapes) {
				if (obj.contain(event.getX(), event.getY())) {
					currentShapeObject = obj;
					movable = true;
					O[0] = event.getX();
					O[1] = event.getY();
					O1_[0] = obj.getX1();
					O1_[1] = obj.getY1();
					O2_[0] = obj.getX2();
					O2_[1] = obj.getY2();
				}
			}
			
			if (!movable) {
				switch (currentShapeType) {
				case 0:
					currentShapeObject = new Line(event.getX(), event.getY(), event.getX(), event.getY(),
							currentShapeColor);
					break;
				case 1:
					currentShapeObject = new Circle(event.getX(), event.getY(), event.getX(), event.getY(),
							currentShapeColor, false);
					break;
				case 2:
					currentShapeObject = new Rectangle(event.getX(), event.getY(), event.getX(), event.getY(),
							currentShapeColor, false);
					break;
				}
			}
		}

		public void mouseReleased(MouseEvent event) {
			if (!movable) {	
				currentShapeObject.setX2(event.getX());
				currentShapeObject.setY2(event.getY());
	
				myShapes.add(currentShapeObject);
				System.out.println(myShapes.toArray());
			} else {
				movable = false;
			}
			
			currentShapeObject = null;
			repaint();
		}
		
		public void mouseMoved(MouseEvent event) {
			statusLabel.setText(String.format("Mouse Coordinates X: %d Y:%d", event.getX(), event.getY()));
		}

		public void mouseDragged(MouseEvent event) {
			
			if (movable) {
				int diff[] = new int[2];
				diff[0] = event.getX() - O[0];
				diff[1] = event.getY() - O[1];
				
				currentShapeObject.setX1(O1_[0] + diff[0]);
				currentShapeObject.setY1(O1_[1] + diff[1]);
				currentShapeObject.setX2(O2_[0] + diff[0]);
				currentShapeObject.setY2(O2_[1] + diff[1]);
			} else {
				currentShapeObject.setX2(event.getX());
				currentShapeObject.setY2(event.getY());
			}
			
			statusLabel.setText(String.format("Mouse -d Coordinates X: %d Y:%d", event.getX(), event.getY()));
			repaint();
		}
	}
}
