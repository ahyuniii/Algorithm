package 일차원배열;

import java.util.Scanner;

public class 과제안내신분_5597 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 배열 arr 선언
		boolean[] arr = new boolean[30]; // 학생 수 30명
		
		// 출석번호에 맞는 인덱스 - 1 값에 true 입력
		for(int i = 0; i < arr.length - 2; i++) { // 2명만 미제출
			int check = input.nextInt();
			arr[check - 1] = true;
		}	
		// arr[i]에 true가 입력되지 않은 false값만 출력
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i]) {
				System.out.println(i + 1);
			}
		}
	}
}
