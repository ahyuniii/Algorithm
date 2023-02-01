package 일차원배열;

import java.util.Scanner;

public class 최소최대_10818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); // N = 배열 요소의 갯수
		
		// 배열 arr 생성 및 요소 입력
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		// 최댓값, 최솟값 구하기
		int max = arr[0]; // 최댓값 초기화
		int min = arr[0]; // 최솟값 초기화
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		// 최댓값, 최솟값 출력
		System.out.println(min + " " + max);
	}
}
