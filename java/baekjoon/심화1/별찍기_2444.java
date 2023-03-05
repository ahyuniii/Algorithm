package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기_2444 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(input.readLine());
		
		for(int i = 1; i <= 2 * N - 1; i++) {
			if(i <= N) {
				for(int j = 1; j <= N + i - 1; j++) {
					if(j <= N - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} else {
				for(int j = 1; j <= 2 * N - (i - N) - 1; j++) {
					if(j <= i - N) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
