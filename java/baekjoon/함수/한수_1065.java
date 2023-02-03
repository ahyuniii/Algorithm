package 함수;

import java.util.Scanner;

public class 한수_1065 {

	public static int seq(int N) {
		int count = 0;
		if(N < 100) {
			return N;
		} else {
			count = 99;

			for(int i = 100; i <= N; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(seq(n));

	}
}
