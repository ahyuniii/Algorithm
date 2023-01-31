package Beginner;

import java.util.Scanner;

public class 숫자사각형4_2046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 정사각형 한 변의 길이 
		int m = input.nextInt(); // m = 종류
		
		switch (m) {
		case 1: { 
			for(int i = 1; i <= n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
		}
		case 2 : {
			for(int i = 1; i <= n; i++) {
				if(i % 2 != 0) { //홀수 줄일때
					for(int j = 0; j < n; j++) {
						System.out.print((1 + j) + " ");
					}
				} else {
					for(int j = 0; j < n; j++) {
						System.out.print((n - j) + " ");
					}
				}
				System.out.println();
			}
			break;
		}
		case 3 : {
			for(int i = 1; i <= n; i++) {
				int num = i;
				for(int j = 0; j < n; j++) {
					System.out.print(num + " ");
					num += i;
				}
				System.out.println();
			}
			break;
		}
		//default:
			//throw new IllegalArgumentException("Unexpected value: " + m);
		}
	}

}
