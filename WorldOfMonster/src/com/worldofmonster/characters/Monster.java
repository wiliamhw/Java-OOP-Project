package com.worldofmonster.characters;

//super class, parent class, base class
public class Monster {

	String name;
	private int healthPoint;
	private int speed;
	private int level;
	
	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public Monster() {
		this.healthPoint = 0;
		this.speed = 0;
		this.level = 0;
	}

	public Monster(int healthPoint, int speed) {
		this.healthPoint = healthPoint;
		this.speed = speed;
		this.level = 1;
	}
	
	public Monster(int healthPoint, int speed, int level) {
		this(healthPoint, speed);
		this.level = level;
	}
	
	public void walk() {
		System.out.println("Monster is walking...");
	}
	
	//overloading
	public void attack() {
		System.out.println("Monster is attacking...");
	}

}
