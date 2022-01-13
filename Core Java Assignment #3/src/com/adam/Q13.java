package com.adam;
//import Scanner
import java.util.Scanner;

public class Q13 {
	public static void triangle() {
		//Instantiate scanner to ask for how many lines
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		//variable to keep count
		int k = 1;
		//Loop for how many lines
		for (int i = 1; i <=n; i++) {
			//Loop for printing
			for(int j = 1; j <= i; j++) {
				int num = (k % 2 == 1) ? 0 : 1;
						System.out.print(num);
						k++;
			}
			System.out.println();
		}
	}
}
