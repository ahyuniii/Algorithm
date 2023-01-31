package java_algorithm01;

import java.util.Scanner;

public class 구간합구하기5_11660 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); // N = 표의크기
		int M = input.nextInt(); // M = 합을 구할 좌표 수
		
		// 기본 배열 입력하기
		int[][] arr1 = new int[N][N];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = input.nextInt();
			}
		}
		// 원하는 좌표 배열 입력하기
		int[][] arr2 = new int[M][N];
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = input.nextInt();
			}
		}
		// 좌표 지정하기
		int sum = 0;
		for(int i = 0 ; i < arr2.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				int x = arr2[i][j];
				int y = arr2[i][j + 1];
				while(x <= arr2.length) {
					while(y <= arr1.length) {
						int xy = arr1[x][y];
						sum += xy;
						y++;
					}
					x++;
				}
			}
			System.out.println(sum);
		}
	}

}
