package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 문자열반복_2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(input.readLine()); // T = 테스트케이스 수
		for(int i = 0; i < T; i++) {
			String[] str = input.readLine().split(" ");

			int R = Integer.parseInt(str[0]); // R = 반복 횟수
			String S = str[1];
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}		
	}

}
