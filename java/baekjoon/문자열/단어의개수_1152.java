package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 단어의개수_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		
		int wordSum = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				wordSum++;
			}
		}
		if(str.charAt(0) == ' ') {
			wordSum--;
		}
		if(str.charAt(str.length() - 1) == ' ') {
			wordSum--;
		}
		System.out.println(wordSum);
	}
}
