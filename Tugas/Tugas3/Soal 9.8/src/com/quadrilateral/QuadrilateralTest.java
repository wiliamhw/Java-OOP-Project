package com.quadrilateral;

public class QuadrilateralTest {

	public static void main(String[] args) {
		Quadrilateral items[] = {
			new Square(), // (0, 0), (0, 1), (1, 1), (1, 0)
			new Rectangle(), // (0, 0), (0, 1), (4, 1), (4, 0)
			new Parallelogram(), // (0, 0), (1, 1), (4, 1), (3, 0)
			new Trapezoid() // (0, 0), (6, 0), (4, 1), (2, 1)
		};

		for (Quadrilateral i : items) {
			System.out.println(i.getArea());
		}
		
//		for (int i = 0; i < items.length; i++) {
//			System.out.println(items[i].getArea());
//		}
		
	}

}
