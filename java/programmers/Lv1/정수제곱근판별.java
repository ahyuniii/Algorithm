package Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정수제곱근판별 {

	public static long main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(input.readLine());		
		if(Math.pow((int)Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		}
		return -1;
	}

}
