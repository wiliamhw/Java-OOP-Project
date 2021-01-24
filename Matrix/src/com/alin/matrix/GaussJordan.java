package com.alin.matrix;

import java.util.Scanner;

public class GaussJordan extends Gauss{
	
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
		
		this.gauss(getOrde());
		gaussJordan(getOrde());
		System.out.println("Det: " + det);
		System.out.println();
	}
	
	
	private void gaussJordan(int x) {
		for(int i = x-1; i>0; i--) {
			for(int j=i-1; j<i && j>=0; j--) {
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
	}
}
