package com.carbonfootprint;

public class Bicycle implements CarbonFootprint {
	// Carbon footprint's constant (kgCO2e/km)
	// Based on: https://www.ourstreetsmpls.org/does_bike_commuting_affect_your_carbon_footprint_and_how_much
	private final double K = 0.016;
	private double distance; // in Km
	private double currSpeed; // in Km/H
	private int timeTraveled; // im secpmds
	private String color;
	private String type;
	private String brand;
	private String tyreBrand;
	
	// Behaviour
	public void accelerate(double accel, double timeTraveled) {
		this.distance += (this.currSpeed * timeTraveled + 
				accel * Math.pow(timeTraveled, 2) / 2);
		this.currSpeed += accel * timeTraveled;
	}
	
	public void brake(double accel, double time) {
		this.distance += (this.currSpeed * time - 
				accel * Math.pow(time, 2) / 2);
		this.currSpeed -= accel * time;
	}
	
	public Bicycle(double distance, double currSpeed, int timeTraveled, String color, String type, String brand,
			String tyreBrand) {
		this.distance = distance;
		this.currSpeed = currSpeed;
		this.timeTraveled = timeTraveled;
		this.color = color;
		this.type = type;
		this.brand = brand;
		this.tyreBrand = tyreBrand;
	}

	public double getCarbonFootprint() {
		return K * distance;
	}
	
	public double getSpeed() {
		return this.distance/this.timeTraveled;
	}
	
	@Override
	public String toString() {
		return "Bicycle" + "\n" +
			"Carbon footprint's constant = " + K + " kgCO2e/km\n" +
			"Distance = " + distance + " Km\n" +
			"Current speed = " + currSpeed + " Km/H\n" +
			"Time traveled = " + timeTraveled + " seconds\n" +
			"Color = " + color + "\n" +
			"Type = " + type + "\n" +
			"Brand = " + brand + "\n" +
			"Tyre brand = " + tyreBrand;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTimeTraveled() {
		return timeTraveled;
	}

	public void setTimeTraveled(int timeTraveled) {
		this.timeTraveled = timeTraveled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTyreBrand() {
		return tyreBrand;
	}

	public void setTyreBrand(String tyreBrand) {
		this.tyreBrand = tyreBrand;
	}
	
	public double getK() {
		return K;
	}
}
