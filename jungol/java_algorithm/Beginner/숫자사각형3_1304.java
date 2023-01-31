package Beginner;

import java.util.Scanner;

public class 숫자사각형3_1304 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int num = i;
			for(int j = 0; j < n; j++) {
				System.out.print(num + " ");
				num += n;
			}
			System.out.println();
		}
	}

}
