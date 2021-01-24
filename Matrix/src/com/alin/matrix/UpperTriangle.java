package com.alin.matrix;

import java.util.Scanner;

public class UpperTriangle extends Matrix{
	private double det = 1;
	
	protected double getDet(double[][] mat, int x) {
		det = 1;
		for(int i=0; i<x; i++) {
			det = this.roundToPrecision(det * mat[i][i]);
		}
		return det;
	}
	
	public void calculate() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input orde : ");
		setOrde(scanner.nextInt());
		
		setMat();	
		
		upperTriangle(getMat(), getOrde());
		
		System.out.println("Determinant : " + det);
	}
	
	protected void upperTriangle(double[][] mat, int x) {
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j) {
					continue;
				}
				if(mat[j][i] != 0) {
					double opr = mat[j][i]/mat[i][i];
					for(int k=0; k<x; k++) {
						mat[j][k] = this.roundToPrecision(mat[j][k] - this.roundToPrecision(opr*mat[i][k]));
					}
					System.out.println("Iteration : " + (counter));
					print(mat, x);
					counter++;
					System.out.println();
					continue;
					
				}
			}
		}
		getDet(mat,x);
	}
	
	private void print(double[][] mat, int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
}
