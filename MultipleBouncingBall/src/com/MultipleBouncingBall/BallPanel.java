package com.MultipleBouncingBall;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

import java.util.List;
import java.util.ArrayList;

public class BallPanel extends JPanel {
	private static final int REFRESH_RATE = 30;
	public List<Ball> balls;
	private BallArea box;
	private int areaWidth;
	private int areaHeight;

	public BallPanel(int width, int height) {
		this.areaWidth = width;
		this.areaHeight = height;
		this.setPreferredSize(new Dimension(areaWidth, areaHeight));
		
		Random rand = new Random();
		this.balls = new ArrayList<Ball>();
		int radius = 50;
		int speed = 5;
		Color[] temp = {Color.BLUE, new Color(217, 217, 217), Color.RED, Color.GREEN, Color.ORANGE, Color.YELLOW, Color.PINK};
		int t = 7; // banyak warna
		int n = 10; // banyak bola
		
		for (int i = 0; i < n; i++) {
			int x = rand.nextInt(width - radius * 2 - 20) + radius + 10;
			int y = rand.nextInt(height - radius * 2 - 20) + radius + 10;
			int angleInDegree = rand.nextInt(360);

			this.balls.add(new Ball(x, y, radius, speed, angleInDegree, temp[i % t]));
		}
		box = new BallArea(0, 0, width, height, Color.BLACK, Color.WHITE);
		
		//untuk mendapatkan ukuran area latar belakang jika frame diresize
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Component c = (Component) e.getSource();
				Dimension dim = c.getSize();
				areaWidth = dim.width;
				areaHeight = dim.height;
				box.set(0, 0, areaWidth, areaHeight);
			}
		});
		startThread(balls);
	}

	public void startThread(List<Ball> balls) {
		Thread gameThread = new Thread() {
			public void run() {
				double distance;
				while (true) {
					for (Ball b1 : balls) {
						b1.edgeCollide(box);
						
						for (Ball b2 : balls) {
							if (b1.x == b2.x && b1.y == b2.y) continue;
							b1.ballCollide(b2);
							b1.overlap(b2, areaWidth, areaHeight);
						}
					}
					repaint();
					try {
						Thread.sleep(1000 / REFRESH_RATE);
					} catch (InterruptedException ex) {}
				}
			}
		};
		gameThread.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		box.draw(g);
		for (Ball ball : balls) {
			ball.draw(g);
		}
	}
}