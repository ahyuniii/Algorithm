package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 알파벳찾기_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String S = input.readLine();

		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
}
