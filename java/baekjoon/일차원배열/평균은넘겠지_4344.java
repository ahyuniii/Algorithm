package 일차원배열;

import java.util.Scanner;

public class 평균은넘겠지_4344 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int C = input.nextInt();// N = 테스트 케이스
		
		for(int i = 0; i < C; i++) {
			int N = input.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			
			for(int j = 0; j < N; j++) {
				int grade = input.nextInt();
				arr[j] = grade;
				sum += grade;
			}
			
			double avg = sum / N; // 평균
			int n = 0; // n = 평균을 넘는 학생 수
			for(int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					n++;
				}
			}
			//double avg_Over = (double) n / N * 100;
			System.out.printf("%.3f%%\n", (double) n / N * 100);
		}
	}
}
