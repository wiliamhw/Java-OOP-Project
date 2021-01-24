/* 
	 Hanya menerima dua angka dan 1 operator
	 Cth: 1 + 3; 1 * 2; dsb
	 
	 Jika ingin melakukan perhitungan menggunakan hasil sebelumnya,
	 masukan <operator> <angka>
	 Cth: + 6.5; * 9; % 10; dsb
	 
	 Jika ingin melakukan perhitungan baru / 
	 menghapus penyimpanan hasil perhitungan sebelumnya,
	 masukan <angka> <operator> <angka>
	 Cth: 1.5 * 3; dsb
	 
	 Jika ingin menghitung logaritma / trigonometri,
	 masukan <operator> <angka>
	 Cth: cos 60, log 10
	 
	 Program akan berhenti ketika user menginput "stop".
 */

package com.example;

import java.util.Scanner;

public class Calculator {

	static class Material {
		String in;
		String[] temp;
		double[] num = new double[2];
		double hasil;
		char opCode;
		
		boolean isOperator(char x) {
			return (x == '+' || x == '-' || x == '*' || x == '/' || x == '%') ? true : false;
		}
		
		boolean isTrigonometric(String x) {
			return (x.equalsIgnoreCase("sin") || x.equalsIgnoreCase("cos") || x.equalsIgnoreCase("tan") ||
					x.equalsIgnoreCase("asin") || x.equalsIgnoreCase("acos") || x.equalsIgnoreCase("atan")) ? true : false;
		}
		
		void parse() {
			temp = in.split(" ", 3);
			try { // Jika input tidak bisa diparse / input tidak valid
				if (temp[0].length() == 1 && isOperator(temp[0].charAt(0))) { // Untuk perhitungan menggunakan hasil sebelumnya
					num[0] = hasil;
					num[1] = Double.parseDouble(temp[1]);
					opCode = temp[0].charAt(0);
				} 
				else if (isTrigonometric(temp[0])) { // Untuk perhitungan trigonometri
					num[0] = Double.parseDouble(temp[1]);
					opCode = temp[0].charAt(1);
				}
				else if (temp[0].equalsIgnoreCase("log") || temp[0].equalsIgnoreCase("log10")) { // Untuk perhitungan logaritma
					num[0] = Double.parseDouble(temp[1]);
					if (temp[0].length() == 3) opCode = '1';
					else opCode = '2';
				}
				else { // Untuk perhitungan baru
					num[0] = Double.parseDouble(temp[0]);
					num[1] = Double.parseDouble(temp[2]);
					opCode = temp[1].charAt(0);
				}
			} catch (Exception e) {
				opCode = 'E';
			}
		}	
		
		void operate() {
			switch(opCode) {
				case '+':
					hasil = num[0] + num[1];
					break;
				case '-':
					hasil = num[0] - num[1];
					break;
				case '*':
					hasil = num[0] * num[1];
					break;
				case '/':
					hasil = num[0] / num[1];
					break;
				case '%':
					hasil = num[0] % num[1];
					break;
				case '^':
					hasil = Math.pow(num[0], num[1]);
					break;
				case 'i':
					hasil = Math.sin(num[0]);
					break;
				case 'o':
					hasil = Math.cos(num[0]);
					break;
				case 'a':
					hasil = Math.tan(num[0]);
					break;
				case 's':
					hasil = Math.asin(num[0]);
					break;
				case 'c':
					hasil = Math.acos(num[0]);
					break;
				case 't':
					hasil = Math.atan(num[0]);
					break;
				case '1':
					hasil = Math.log(num[0]);
					break;
				case '2':
					hasil = Math.log10(num[0]);
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Format input untuk perhitungan baru: <num> <operator> <num> (1 + 5)");
		System.out.println("Format input untuk melanjutkan perhitungan: <operator> <num> (+ 5)");
		System.out.println("Format input trigonometri dan logaritma: <operator> <num> (cos 5)");
		System.out.println("Untuk berhenti, ketik \"stop\"");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		Material input = new Material();
		
		while (true) {
			System.out.print("Masukan input ==> ");
			input.in = scanner.nextLine().trim();
			
			if (input.in.toLowerCase().equals("stop")) {
				System.out.println("Program berhenti");
				break;
			}
			
			input.parse();
			if (input.in.isEmpty() || input.opCode == 'E') {
				System.out.println("Input tidak valid / penggunaan spasi tidak tepat");
				continue;
			}
			input.operate();
			
			if (Math.abs(input.hasil) - Math.abs((int)input.hasil) <= 0.0001) {
				System.out.println("Hasil: " + (int)input.hasil);
			} else {
				System.out.printf("Hasil: %.3f\n", input.hasil);
			}	
		}
		scanner.close();
	}
}
