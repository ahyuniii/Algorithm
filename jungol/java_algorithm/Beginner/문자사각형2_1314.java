package Beginner;

import java.util.Scanner;

public class 문자사각형2_1314 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 정사각형 한 변의 길이
		char[][] arr = new char[n][n];
		char ch = 'A';
		
		// 배열 입력
		for(int j = 0; j < n; j++) {
			if(j % 2 == 0) {
				for(int i = 0; i < n; i++) {
					arr[i][j] = ch++;
					if(ch >= 'Z' + 1) {
						ch = 'A';
					}
				}
			} else {
				for(int i = n - 1; i >= 0; i--) {
					arr[i][j] = ch++;
					if(ch >= 'Z' + 1) {
						ch ='A';
					}
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
