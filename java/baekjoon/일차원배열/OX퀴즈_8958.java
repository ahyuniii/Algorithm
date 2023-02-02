package 일차원배열;

import java.util.Scanner;

public class OX퀴즈_8958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // n = 테스트 개수
		String[] arr = new String[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.next();
		}

		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			for(int j = 1; j <= arr[i].length(); j++) {
				if(arr[i].charAt(j - 1) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}
