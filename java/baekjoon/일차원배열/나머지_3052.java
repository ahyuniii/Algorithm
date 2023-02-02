package 일차원배열;

import java.util.Scanner;

public class 나머지_3052 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 배열 arr에 42로 나눈 나머지 입력
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt() % 42;
		}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean temp = false; // 나머지가 같은 경우 비교, 모두 다를 경우가 기본값
			for(int j = i + 1; j < arr. length; j++) {
				if(arr[i] == arr[j]) { // 배열의 i번째와 i+1번째의 수가 같은지 판단
					temp = true; 
					break; // 한번만 비교하여 조건이 성립하면 break;
				}
			}
			if(temp == false) { // 같은 수가 없는 나머지의 개수 출력
				count++;
			}
		}
		System.out.println(count);
	}
}
