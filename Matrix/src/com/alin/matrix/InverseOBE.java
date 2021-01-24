package com.alin.matrix;

import java.util.Scanner;

public class InverseOBE extends Matrix{
	private double[][] matIdentity;
	
	private void setMatIdentity(int x) {
		matIdentity = new double[x][x];
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				if(i==j) 
					matIdentity[i][j] = 1;
				
				else 
					matIdentity[i][j] = 0;
			}
		}
	}
	
	public void calculate() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input orde : ");
		setOrde(scanner.nextInt());
		
		setMat();
		
		setMatIdentity(getOrde());
		
		gauss(getMat(), getOrde());
		
		gaussJordan(getMat(), getOrde());
		
	}
	
	private void gauss(double[][] mat, int x) {
		for(int i=0; i<x; i++) {
			for(int j=i; j<x; j++) {
				if(i==j && mat[j][i] != 1) {
					double opr = mat[j][i];
					for(int k=0; k<x; k++) {
						if(mat[j][k] != 0)
							mat[j][k] = mat[j][k]/opr;
						if(matIdentity[j][k] != 0)
						matIdentity[j][k]= matIdentity[j][k]/opr;
					}
					System.out.println(counter);
					print(mat, x);
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
						matIdentity[j][k] = matIdentity[j][k] - (opr*matIdentity[i][k]);
					}
					System.out.println(counter);
					print(mat, x);
					counter++;
					System.out.println();
					continue;
				}
			}
		}
	}
	
	private void gaussJordan(double mat[][], int x) {
		for(int i = x-1; i>0; i--) {
			for(int j=i-1; j<i && j>=0; j--) {
				if(mat[j][i] != 0 && i!=j) {
					double opr = mat[i][i]*mat[j][i];
					for(int k=0; k<x; k++) {
						double subtractor = (double) Math.round(opr*mat[i][k] * Math.pow(10, this.precision))
								/ Math.pow(10, this.precision);
						mat[j][k] = mat[j][k] - subtractor;
						matIdentity[j][k] = matIdentity[j][k] - (opr*matIdentity[i][k]);
					}
					System.out.println(counter);
					print(mat, x);
					counter++;
					System.out.println();
					continue;
				}
			}
		}
	}
	
	private void print(double[][] mat, int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x; j++) {
				System.out.printf(mat[i][j] + "  ");
			}
			System.out.print("|");
			for(int k=0; k<x; k++) {
				System.out.printf("  " + matIdentity[i][k]);
			}
			System.out.println();
		}
	}
}
