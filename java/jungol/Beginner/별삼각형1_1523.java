package Beginner;

import java.util.Scanner;

public class 별삼각형1_1523 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 높이
		int m = input.nextInt(); // m = 종류

		if(n <= 0 || n > 100 || m <= 0 || m > 3) {
			System.out.println("INPUT ERROR!");
		} else {
			switch(m) {
			case 1 : {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
			case 2 : {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n - i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
			case 3 : {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n + i; j++) {
						if(j < n - i - 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;
			}
			}
		}
	}
}
