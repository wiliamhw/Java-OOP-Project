package com.carbonfootprint;
import java.util.ArrayList;

public class CarbonFootprintTest {

	public static void main(String[] args) {
		ArrayList<CarbonFootprint> items = new ArrayList<CarbonFootprint>();
		
		//double electricity, double area, int resident, int floor, int room, String address
		items.add(new Building(28.9, 228, 4, 2, 3, "Blue rose street"));
		
		// double distance, double topSpeed, double fuelConsumption, double maxFuelCapacity, 
		// int timeTraveled, int horsepower, double price, String color, String brand
		items.add(new Car(46.671, 150, 40, 198, "white", "Toyota Avanza"));
		
		// double distance, int timeTraveled, double price, String color, String type, 
		// String brand, String tyreBrand
		items.add(new Bicycle(72, 5, 1800, "black", "BMX", "Polygon", "Kenda"));
		
		for (CarbonFootprint item : items) {
			System.out.printf("%s\n", item.toString());
			System.out.printf("Carbon footprint: %.2f Kg\n\n", item.getCarbonFootprint());
		}
	}

}
