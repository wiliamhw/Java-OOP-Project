package com.DynamicMultipleBouncingBall;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ball {
	float x, y;
	float speedX, speedY;
	float radius;
	private Color color;
	char symbol;

	public Ball(float x, float y, float radius, float speed, float angleInDegree, Color color, char symbol) {
		this.x = x;
		this.y = y;
		this.speedX = (float) (speed * Math.cos(Math.toRadians(angleInDegree)));
		this.speedY = (float) (-speed * (float) Math.sin(Math.toRadians(angleInDegree)));
		this.radius = radius;
		this.color = color;
		this.symbol = symbol;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius), (int) (2 * radius));
		
		//render text
		g.setFont(new Font("TimesRoman", Font.BOLD, 15)); 
		FontMetrics metrics = g.getFontMetrics(g.getFont());
		int stringPosX = (int) this.x - (int) (metrics.charWidth(symbol) / 2);
		int stringPosY = (int) this.y + 5;
		g.setColor(Color.WHITE);
				
		g.drawString(String.valueOf(this.symbol), stringPosX, stringPosY);
			
	}

	public void edgeCollide(BallArea box) {
		float ballMinX = box.minX + radius;
		float ballMinY = box.minY + radius;
		float ballMaxX = box.maxX - radius;
		float ballMaxY = box.maxY - radius;

		x += speedX;
		y += speedY;

		if (x < ballMinX) {
			speedX = -speedX;
			x = ballMinX;
		} else if (x > ballMaxX) {
			speedX = -speedX;
			x = ballMaxX;
		}

		if (y < ballMinY) {
			speedY = -speedY;
			y = ballMinY;
		} else if (y > ballMaxY) {
			speedY = -speedY;
			y = ballMaxY;
		}
	}
	
	public void ballCollide(Ball ball) {
		double distance = pytagoras(Math.abs(this.x - ball.x), Math.abs(this.y - ball.y));
		double truDist = this.radius + ball.radius;
		
		if (distance < truDist) {
			this.speedX = -this.speedX;
			this.speedY = -this.speedY;
			ball.speedX = -ball.speedX;
			ball.speedY = -ball.speedY;
			
			this.x += this.speedX;
			this.y += this.speedY;
		}
	}
	
	public void overlap(Ball ball, int width, int height) {
		Random rand = new Random();
		double truDist = this.radius + ball.radius;
		double distance;
		
		while (true) {
			distance = pytagoras(Math.abs(this.x - ball.x), Math.abs(this.y - ball.y));
			
			if (distance < truDist) {
				this.x = rand.nextInt((int) (width - this.radius * 2 - 20)) + this.radius + 10;
				this.y = rand.nextInt((int) (height - this.radius * 2 - 20)) + this.radius + 10;
			} else {
				break;
			}
		}
	}
		

	public double pytagoras(double r1, double r2) {
		return Math.sqrt(Math.pow(r1, 2) + Math.pow(r2, 2));
	}
}