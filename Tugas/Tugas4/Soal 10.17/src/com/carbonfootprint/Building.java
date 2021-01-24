package com.carbonfootprint;

public class Building implements CarbonFootprint {
	// Carbon footprint's constant (kgCO2e/kWh)
	// Based on: https://www.carbonfootprint.com/calculator.aspx
	private final double K = 0.4532;
	private double electricity; // in kWH
	private double area; // in m^2
	private int resident;
	private int floor;
	private int room;
	private String address;
	
	// Behaviour
	public void addResident(int people) {
		this.resident += people;
	}
	
	public void reduceResident(int people) {
		this.resident -= people;
	}
	
	public void addFloor(int floor) {
		this.floor += floor;
	}
	
	public void reduceFloor(int floor) {
		this.floor -= floor;
	}
	
	public void addRoom(int room) {
		this.floor += floor;
	}
	
	public void reduceRoom(int room) {
		this.room -= room;
	}
	
	// Constructor
	public Building(double electricity, double area, int resident, int floor, int room, String address) {
		this.electricity = electricity;
		this.area = area;
		this.resident = resident;
		this.floor = floor;
		this.room = room;
		this.address = address;
	}

	public double getCarbonFootprint() {
		return K * electricity;
	}
	
	public double getAverageElectriciyy() {
		return this.electricity/this.resident;
	}
	
	
	@Override
	public String toString() {
		return "Building" + "\n" +
			"Carbon footprint's constant = " + K + " kgCO2e/kWh\n" +
			"Electricity = " + electricity + " KwH\n" +
			"Area = " + area + " m^2\n" +
			"Resident = " + resident + " people\n" +
			"Floor = " + floor + "\n" +
			"Room = " + room + "\n" +
			"Address = " + address;
	}

	public double getElectricity() {
		return electricity;
	}

	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getResident() {
		return resident;
	}

	public void setResident(int resident) {
		this.resident = resident;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getK() {
		return K;
	}
}
