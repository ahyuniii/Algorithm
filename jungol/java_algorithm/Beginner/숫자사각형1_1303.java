package Beginner;

import java.util.Scanner;

public class 숫자사각형1_1303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n=높이
		int m = input.nextInt(); // m=너비
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}