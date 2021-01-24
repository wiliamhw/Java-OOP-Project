package com.alin.matrix;

import java.util.Scanner;

public class Gauss extends Matrix{
	protected double[][] mat;
	protected double det = 1;

	protected void getDet(int x) {
		for(int i=0; i<x; i++) {
			det = this.roundToPrecision(det * mat[i][i]);
		}
	}
	
	public void calculate() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input orde : ");
		setOrde(scanner.nextInt());
		
		mat = new double[getOrde()][getOrde()];
		
		System.out.println("Input matrix (orde x orde)");
		
		for(int i=0; i<getOrde(); i++) {
			for(int j=0; j<getOrde(); j++) {
				mat[i][j] = scanner.nextDouble();
			}
		}
		
		gauss(getOrde());
		System.out.println("Det: " + det);
		System.out.println();
	}
	
	protected void gauss(int x) {
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j && mat[j][i] != 1) {
					System.out.println("Iterasi: " + counter);
					double opr = mat[j][i];
					det = this.roundToPrecision(det * opr);
					
					System.out.println("b" + (j+1) + " = " + "b" + (j+1) + " * " + "1/" + this.roundToPrecision(opr));
					
					for(int k=0; k<x; k++) {
						if(mat[j][k] != 0)
							mat[j][k] = this.roundToPrecision(mat[j][k]/opr);
					}
					print(x);
					counter++;
					System.out.println();
					continue;
				}
				if(mat[j][i] != 0 && i!=j) {
					System.out.println("Iterasi: " + counter);
					double opr = mat[i][i]*mat[j][i];
					
					System.out.println("b" + (j+1) + " = " + "b" + (i+1) + " * " + this.roundToPrecision(-opr) +
							" + " + "b" + (j+1));
					
					for(int k=0; k<x; k++) {
						mat[j][k] = this.roundToPrecision(mat[j][k] - this.roundToPrecision(opr*mat[i][k]));
					}
					print(x);
					counter++;
					System.out.println();
					continue;
					
				}
			}
		}
		getDet(x);
	}
	
	protected void print(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
}
