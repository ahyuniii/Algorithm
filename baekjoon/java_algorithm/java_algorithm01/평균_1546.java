package java_algorithm01;

import java.util.Scanner;

public class 평균_1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // 과목 수
		int[] arr = new int[n];  // 시험 점수 배열
		
		// 시험 점수 배열에 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		// 시험 점수 배열에서 최댓값 구하기
		long total = 0;
		long max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				total += arr[i];
			}
		}
		// 시험 점수 조작하기 // 오류
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (arr[i] / max) * 100;     // (int형/int형)이라 0이 나올수있음
//		}
		
		
		// 조작한 시험 점수의 평균 출력(수식활용)
		System.out.print(total * 100.00/max/n);
	}

}
