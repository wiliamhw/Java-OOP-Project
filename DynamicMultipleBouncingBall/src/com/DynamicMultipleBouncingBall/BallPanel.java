package com.DynamicMultipleBouncingBall;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.List;
import java.util.ArrayList;

public class BallPanel extends JPanel implements KeyListener {
	private static final int REFRESH_RATE = 30;
	public List<Ball> balls;
	private BallArea box;
	private int areaWidth;
	private int areaHeight;
	private int radius;
	private int speed;
	private int n; // banyak bola
	private int t = 5; // banyak warna
	private Color[] color = { Color.BLUE, Color.RED, new Color(248, 148, 6), 
								new Color(46, 204, 113), new Color(103, 128, 159), 
								new Color(154, 18, 179) };

	public BallPanel(int width, int height) {
		this.areaWidth = width;
		this.areaHeight = height;
		this.setPreferredSize(new Dimension(areaWidth, areaHeight));

		this.balls = new ArrayList<Ball>();
		radius = 50;
		speed = 5;
		n = 5; // banyak bola awal
		for (int i = 0; i < n; i++) {
			makeBall(color[i % t], (char) (i + 'A'));
		}
		box = new BallArea(0, 0, width, height, Color.BLACK, Color.WHITE);

		// untuk mendapatkan ukuran area latar belakang jika frame diresize
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
		this.addKeyListener(this);
		this.setFocusable(true);
		startThread();
	}

	private void makeBall(Color color, char symbol) {
		Random rand = new Random();
		int x = rand.nextInt(areaWidth - radius * 2 - 20) + radius + 10;
		int y = rand.nextInt(areaHeight - radius * 2 - 20) + radius + 10;
		int angleInDegree = rand.nextInt(360);

		this.balls.add(new Ball(x, y, radius, speed, angleInDegree, color, symbol));
	}

	public void startThread() {
		Thread gameThread = new Thread() {
			public void run() {
				double distance;
				while (true) {
					for (Ball b1 : balls) {
						b1.edgeCollide(box);

						for (Ball b2 : balls) {
							if (b1.x == b2.x && b1.y == b2.y)
								continue;
							b1.ballCollide(b2);
							b1.overlap(b2, areaWidth, areaHeight);
						}
					}
					repaint();
					try {
						Thread.sleep(1000 / REFRESH_RATE);
					} catch (InterruptedException ex) {
					}
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

	@Override
	public void keyTyped(KeyEvent e) {
		char key = e.getKeyChar();
		if (Character.isDigit(key) || Character.isLetter(key)) {	
			key = Character.toUpperCase(key);
			makeBall(color[n++ % t], key);
		}	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// do nothing
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// do nothing
	}
}