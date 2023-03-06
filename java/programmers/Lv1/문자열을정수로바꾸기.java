package Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열을정수로바꾸기 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = input.readLine();
		
		int answer = Integer.parseInt(s);
        
		System.out.println(answer);
	}

}
