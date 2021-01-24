package com.alin.matrix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Matrix Calculator (square type matrices)");
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println();
			System.out.println("1. Determinant using upper triangle (swap the row by yourself if necessary)");
			System.out.println("2. Find Determinant using Gauss rule");
			System.out.println("3. Find Determinant using Gauss-Jordan rule");
			System.out.println("0. Exit");
			
			int pick = scanner.nextInt();
			if(pick == 0) break;
			else if(pick == 1) {
				UpperTriangle ut = new UpperTriangle();
				ut.calculate();
			}
			else if(pick == 2) {
				Gauss gauss = new Gauss();
				gauss.calculate();
			}
			else if(pick == 3) {
				GaussJordan gaussJordan = new GaussJordan();
				gaussJordan.calculate();
			}
			else System.out.println("Invalid command!");
		}
	}
}
