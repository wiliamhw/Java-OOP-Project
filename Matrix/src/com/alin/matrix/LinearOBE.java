package com.alin.matrix;

import java.util.Scanner;

public class LinearOBE extends Matrix{
	private double value[];
	private double[][] mat;

	public void calculate() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of variables (number of equations and variables must same!): ");
		
		setOrde(scanner.nextInt());
		mat = new double[getOrde()][getOrde()];
		value = new double [getOrde()];
		
		System.out.println("Input only the constant consecutively from a,b,c,d,....,z");
		System.out.println("For example : x+y+z = 3\nInput : 1 1 1 3");
		
		for(int i=0; i<getOrde(); i++) {
			System.out.print("Equation ");
			System.out.print(i+1);
			System.out.print(" : ");
			for(int j=0; j<getOrde(); j++) {
				mat[i][j] = scanner.nextDouble();
			}
			value[i] = scanner.nextDouble();
		}
		
		gauss(getOrde());
		gaussJordan(getOrde());
		
	}
	
	private void gauss(int x) {
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j && mat[j][i] != 1) {
					double opr = mat[j][i];
					for(int k=0; k<x; k++) {
						if(mat[j][k] != 0)
							mat[j][k] = mat[j][k]/opr;
					}
					value[j] /= opr;
					System.out.println(counter);
					print(x);
					counter++;
					System.out.println();
					continue;
				}
				if(mat[j][i] != 0 && i!=j) {
					double opr = mat[i][i]*mat[j][i];
					for(int k=0; k<x; k++) {
						double subtractor = (double) Math.round(opr*mat[i][k] * Math.pow(10, this.precision))
								/ Math.pow(10, this.precision);
						mat[j][k] = mat[j][k] - subtractor;
					}
					value[j] = value[j] - (opr * value[i]);
					System.out.println(counter);
					print(x);
					counter++;
					System.out.println();
					continue;
					
				}
			}
		}
	}
	
	private void gaussJordan(int x) {
		for(int i = x-1; i>0; i--) {
			for(int j=i-1; j<i && j>=0; j--) {
				if(mat[j][i] != 0 && i!=j) {
					double opr = mat[i][i]*mat[j][i];
					for(int k=0; k<x; k++) {
						double subtractor = (double) Math.round(opr*mat[i][k] * Math.pow(10, this.precision))
								/ Math.pow(10, this.precision);
						mat[j][k] = mat[j][k] - subtractor;
					}
					value[j] = value[j] - (opr*value[i]);
					System.out.println(counter);
					print(x);
					counter++;
					System.out.println();
					continue;
				}
			}
		}
	}
	
	private void print(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "  ");
			}
			System.out.print("|");
			System.out.println("  " + value[i]);
		}
	}
	
}
