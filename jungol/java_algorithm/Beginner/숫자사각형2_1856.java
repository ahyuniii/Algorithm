package Beginner;

import java.util.Scanner;

public class 숫자사각형2_1856 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n=높이
		int m = input.nextInt(); // m=너비
		int num = 1;
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = num++;
				} 
			}else {
				for(int j = m - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}
			}
			}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");				
			}
			System.out.println();
			}		
	}
}
