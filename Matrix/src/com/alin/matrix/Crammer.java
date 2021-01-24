package com.alin.matrix;

import java.util.Scanner;

public class Crammer extends Matrix{
	private double value[];
	private double[][] mat;
	private double[][][] matProc;
	private double[] res;

	private void setMatProc() {
		matProc = new double[getOrde()][getOrde()][getOrde()];
		for(int k=0; k<getOrde(); k++) {			
			for(int i=0; i<getOrde(); i++) {
				for(int j=0; j<getOrde(); j++) {
					if(j == k) matProc[k][i][j] = value[i];
					else matProc[k][i][j] = mat[i][j];
				}
			}
		}
	}
	
	public void calculate() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of variables (number of equations and variables must same!): ");
		
		setOrde(scanner.nextInt());
		mat = new double[getOrde()][getOrde()];
		value = new double [getOrde()];
		
		System.out.println("Input only the constant consecutively from a,b,c,d,....,z");
		System.out.println("For example : x1+x2+x3 = 3\nInput : 1 1 1 3");
		
		for(int i=0; i<getOrde(); i++) {
			System.out.print("Equation ");
			System.out.print(i+1);
			System.out.print(" : ");
			for(int j=0; j<getOrde(); j++) {
				mat[i][j] = scanner.nextDouble();
			}
			value[i] = scanner.nextDouble();
		}
		
		setMatProc();
		res = new double[getOrde()+1];
		
		UpperTriangle ut = new UpperTriangle();
		
		ut.upperTriangle(mat, getOrde());
		res[getOrde()] = ut.getDet(mat, getOrde());
		
		System.out.print("Determinant of A : " + res[getOrde()]);
		System.out.println();
		System.out.println();
		
		for(int i=0; i<getOrde(); i++) {
			ut.upperTriangle(matProc[i], getOrde());
			res[i] = ut.getDet(matProc[i], getOrde());
			System.out.print("Determinant of x");
			System.out.print(i+1);
			System.out.println(" : " + res[i]);
			System.out.println();
		}
		
		for(int i=0; i<getOrde(); i++) {
			System.out.printf("%s%d : %.4f", "Value of x", (1+i), (res[i]/res[getOrde()]));
			System.out.println();
		}
		
	}
}
