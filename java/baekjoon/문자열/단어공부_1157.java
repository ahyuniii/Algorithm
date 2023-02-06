package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 단어공부_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		
		// 알파벳 갯수로 배열 만들기
		int[] alpha = new int[26];
		
//		for(int i = 0; i < str.length(); i++) {
//			// i번째 알파벳이 소문자면 i번째 아스키코드안에 +증가
//			if('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
//				alpha[str.charAt(i) - 97]++;
//			} else { // i번째 알파벳이 소문자가 아니고 대문자면
//				alpha[str.charAt(i) - 65]++;
//			}
//		}
//		int max = -1;
//		char ch = '?'; // 가장 많은 알파벳
//		for(int i = 0; i < 26; i++) {
//			if(alpha[i] > max) {
//				max = alpha[i];
//				ch = (char) (i + 65);
//			} else if (alpha[i] == max) {
//				ch = '?';
//			}
//		}
//		System.out.print(ch);
		
		

		// 내가 처음 푼 로직	
		// 문자열 길이만큼 체크
		for(int i = 0; i < str.length(); i++) {
			// 알파벳 확인
			for(int j = 0 ; j < 26; j++) {
				if(str.charAt(i) == 'a' + j || str.charAt(i) == 'A' + j) {
					alpha[j]++;
					break;
				}
			}
		}
		int max = -1; // 처음엔 max = alpha[0]으로 뒀는데 안되는 이유는 a일 경우 ? 출력
		char ch = ' ';
		for(int i = 0; i < 26; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = (char) ('A' + i);
			} else if(alpha[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
}
