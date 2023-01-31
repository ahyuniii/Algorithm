package Beginner;

import java.util.Scanner;

public class 문자삼각형1_1338 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 삼각형 높이
		char[][] arr = new char[n][n];
		char ch = 'A';
		//배열 초기화
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = ' ';
			}
		}
		
		// 배열 입력
		for(int i = 0; i < n; i++) {
			for(int j = n - 1, x = i ; j >= 0 + i; x++, j--) {
				arr[x][j] = ch++;
				if(ch > 'Z') {
					ch = 'A';
				}
			}
		}
		
		//배열 출력
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
