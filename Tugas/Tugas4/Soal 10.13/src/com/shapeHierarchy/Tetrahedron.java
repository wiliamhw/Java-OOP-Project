package com.shapeHierarchy;

public class Tetrahedron extends ThreeDimensionalShape {
	private double edge;
	
	public Tetrahedron(double edge) {
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	@Override
	public double getArea() {
		return Math.sqrt(3) * Math.pow(this.edge, 2);
	}
	
	@Override
	public double getVolume() {
		return Math.pow(edge, 3) / (6 * Math.sqrt(2));
	}
}
