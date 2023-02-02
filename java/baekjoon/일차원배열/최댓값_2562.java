package 일차원배열;

import java.util.Scanner;

public class 최댓값_2562 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 배열 생성 및 요소 입력
		int[] arr = new int[9]; // 9개의 자연수가 주어짐
		int max = arr[0];
		int n = 0; // n = 최댓값이 n번째 요소
		
		//배열 arr에서 요소의 최댓값과 몇 번째 수인지 구하기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				n = i + 1; // n번째 = 인덱스 + 1
			}
		}
		// 최댓값과 위치 출력
		System.out.println(max);   
		System.out.println(n);   
	}
}
