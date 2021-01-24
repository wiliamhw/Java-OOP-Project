package com.carbonfootprint;

public class Car implements CarbonFootprint {
	// Carbon footprint's constant (kgCO2e/km)
	// Based on: https://www.ourstreetsmpls.org/does_bike_commuting_affect_your_carbon_footprint_and_how_much
	private final double K = 0.271;
	private double distance; // in Km
	private double topSpeed; // in Km/H
	private double currSpeed; // in Km/H
	private String engine;
	private String color;
	private String brand;
	
	// Behaviour
	public void accelerate(double accel, double timeTraveled) {
		if (this.engine == "On") {
			this.distance += (this.currSpeed * timeTraveled + 
					accel * Math.pow(timeTraveled, 2) / 2);
			this.currSpeed += accel * timeTraveled;
		} else {
			System.out.println("Engine is off, engine need to be started !");
		}
	}
	
	public void brake(double accel, double time) {
		if (this.engine == "On") {
			this.distance += (this.currSpeed * time - 
					accel * Math.pow(time, 2) / 2);
			this.currSpeed -= accel * time;
		} else {
			System.out.println("Engine is off, engine need to be started !");
		}
	}
	
	public void turnONEngine() {
		this.engine = "On";
	}
	
	public void turnOffEngine() {
		this.engine = "Off";
	}
	
	// Constructor
	public Car(double distance, double topSpeed, double currSpeed,
			double price, String color, String brand) {
		this.distance = distance;
		this.topSpeed = topSpeed;
		this.currSpeed = currSpeed;
		this.color = color;
		this.brand = brand;
		this.engine = "Off";
	}

	public double getCarbonFootprint() {
		return K * distance;
	}
	
	
	@Override
	public String toString() {
		return "Car\n" +
				"Carbon footprint's constant = " + K + " kgCO2e/km\n" + 
				"Distance = " + distance + " m^2\n" +
				"Top speed = " + topSpeed + " Km/H\n" + 
				"Current speed = " + currSpeed + " Km/H\n" +
				"Engine status = " + engine + "\n" +
				"Color = " + color + "\n" +
				"Brand = " + brand;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public double getCurrSpeed() {
		return currSpeed;
	}

	public void setCurrSpeed(double currSpeed) {
		this.currSpeed = currSpeed;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getK() {
		return K;
	}

	public String getEngine() {
		return engine;
	}
}
