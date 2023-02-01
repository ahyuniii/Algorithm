package java_algorithm01;

import java.util.Scanner;
import java.util.Stack;

public class 스택수열_1874 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); // n = 수열의 개수
		int[] arr = new int[N];
		
		// 배열에 수열(data) 입력받기
		for(int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		
		// Stack, StringBuffer
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer bf = new StringBuffer();
		
		// 오름차순
		int num = 1;
		boolean result = true;
		for(int i = 0; i < arr.length; i++) {
			int su = arr[i];
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					bf.append("+\n");					
				}
				stack.pop();
				bf.append("-\n");
			} else {
				int n = stack.pop();
				if(n > su) {
					System.out.println("No");
					result = false;
					break;
				} else {
					bf.append("-\n")
				}
				
			}
		} 
	}

}
