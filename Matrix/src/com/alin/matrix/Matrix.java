package com.alin.matrix;

import java.util.Scanner;

public class Matrix {
	private double[][] mat;
	private int orde;
	protected int counter = 1;
	protected int precision = 2;
	
	public double[][] getMat() {
		return mat;
	}
	public void setMat() {
		Scanner scanner = new Scanner(System.in);
		
		mat = new double[orde][orde];
		
		for(int i=0; i<orde; i++) {
			for(int j=0; j<orde; j++) {
				mat[i][j] = scanner.nextDouble();
			}
		}
//		scanner.close();
	}
	
	public int getOrde() {
		return orde;
	}
	public void setOrde(int orde) {
		this.orde = orde;
	}
	
	public double roundToPrecision(double x) {
		return (double) Math.round(x * Math.pow(10, this.precision)) / Math.pow(10, this.precision);
	}
}
