package Beginner;

import java.util.Scanner;

public class 문자삼각형2_1339 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 삼각형 높이
		char[][] arr = new char[n][n];
		char ch = 'A';

		if(0 >= n | n > 100 | (n % 2 == 0)) {
			System.out.println("INPUT ERROR");
		} else{
			// 배열 초기화
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = ' ';
				}
			}
			// 배열 입력
			for(int j = n / 2; j >= 0; j--) {
				for(int i = j; j <= i && i < n - j; i++) {
					arr[i][j] = ch++;
					if(ch > 'Z') {
						ch = 'A';
					}
				}
			}
			// 배열 출력
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
