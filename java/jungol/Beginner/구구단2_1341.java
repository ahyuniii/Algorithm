package Beginner;

import java.util.Scanner;

public class 구구단2_1341 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int e = input.nextInt();

		if(s >= e) {
			for(int i = s; i >= e; i--) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
					if(j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		} else {
			for(int i = s; i <= e; i++) {
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
					if(j % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}

		}
	}
}

