package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바구니순서바꾸기_10812 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(input.readLine());

		int N = Integer.parseInt(st.nextToken()); // N = 바구니 개수
		int M = Integer.parseInt(st.nextToken()); // M = 반복 횟수


		int[] basket = new int[N]; //N개의 바구니 배열 
		for(int i = 0; i < N; i++) {
			basket[i] = i + 1; 
		}


		for(int i = 0; i < M; i++) { //M번 반복함
			StringTokenizer st2 = new StringTokenizer(input.readLine());
			int begin = Integer.parseInt(st2.nextToken());
			int end = Integer.parseInt(st2.nextToken());
			int mid = Integer.parseInt(st2.nextToken());

			int b = begin;
			int m = mid;

			for(int j = begin - 1; j < end; j++) {
				if(j < begin + (end - mid)) {
					basket[j] = basket[m - 1];
					m++;
				} else {
					basket[j] = basket[b - 1];
					b++;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			System.out.print(basket[i] + " ");
		}

	}

}
