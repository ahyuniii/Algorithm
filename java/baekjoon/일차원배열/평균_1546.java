package 일차원배열;

import java.util.Scanner;

public class 평균_1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); // N = 시험 본 과목수
		// 배열 arr에 점수 입력
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		// 시험 점수 중 최대값 M 구하기
		int M = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > M) {
				M = arr[i];
			}
		}
		// 새로운 평균 구하기 : {(시험점수1/M)*100 + (시험점수2/M)*100 + (시험점수3/M)*100} / 3
		// = (시험점수1 + 시험점수2 + 시험점수3) * 100 / (3 * M)
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum * 100 / (double)(N * M));
	}
}
