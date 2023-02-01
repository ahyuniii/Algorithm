package 일차원배열;

import java.util.Scanner;

public class 개수세기_10807 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int N = input.nextInt(); // N = 정수의 개수
		 
		 // 배열 생성 및 배열 입력
		 int[] arr = new int[N];
		 for(int i = 0; i < arr.length; i++) {
			 arr[i] = input.nextInt();
		 }
		 int v = input.nextInt(); // v = 찾으려고 하는 정수
		 
		 // 배열 arr에서 v가 몇 개 인지 출력
		 int num = 0; // num = v의 갯수
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] == v) {
				 num++;
			 }
		 }
		 System.out.println(num);
	}
}