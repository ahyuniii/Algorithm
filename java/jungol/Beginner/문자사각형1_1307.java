package Beginner;

import java.util.Scanner;

public class 문자사각형1_1307 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 정사각형 한 변의 길이
		char[][] arr = new char[n][n];
		
		//배열 입력
		char ch = 'A';
		for(int j = n - 1; j >= 0; j--) {
			for(int i = n - 1; i >= 0; i--) {
				arr[i][j] = ch++;
				if(ch >= 'Z' + 1) { // 알파벳 순환
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