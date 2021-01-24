package com.shapeHierarchy;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shapes[] = {
			new Circle(7),
			new Square(4),
			new Triangle(3, 4),
			new Sphere(4),
			new Cube(4),
			new Tetrahedron(5)
		};
		
		for (Shape s : shapes) {
			System.out.printf("%s\n", s.toString());
			if (s instanceof TwoDimensionalShape) {
				System.out.printf("Area: %.2f\n\n", ((TwoDimensionalShape) s).getArea());
			} else if ((s instanceof ThreeDimensionalShape)) {
				System.out.printf("Area: %.2f\n", ((ThreeDimensionalShape) s).getArea());
				System.out.printf("Volume: %.2f\n\n", ((ThreeDimensionalShape) s).getVolume());
			}
		}
	}

}
