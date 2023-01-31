package Beginner;

import java.util.Scanner;

public class 구구단_1291 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();

		while(2 > start || start > 9 || 2 > end || end > 9) {
			System.out.println("INPUT ERROR!");
			start = input.nextInt();
			end = input.nextInt();
		}
		for(int j = 1; j <= 9; j++) {
			if(start >= end) {
				for(int i = start; i >= end; i--) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
				}
				System.out.println();
			} else if(start < end) {
				for(int i = start; i <= end; i++) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
				}
				System.out.println();
			}
		}

	}
}

