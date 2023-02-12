package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 그룹단어체커_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(input.readLine()); // n = 입력되는 단어 개수
		
//		int count = 0; // count = 그룹단어 개수
//		for(int i = 0; i < n; i++) {
//			boolean[] check = new boolean[26]; // 중복되는 알파벳이 있는지 확인
//			String str = input.readLine();
//			
//			for(int j = 0; j < str.length(); j++) {
//				if(str.charAt(j) != str.charAt(j + 1)) {
//					if(check[str.charAt(j) - 'a'] == false) {
//						check[str.charAt(j)] = true;
//					}
//				}
//			}
//			for(int j = 0; j < str.length(); j++) {
//				if(check[i] = true)
//			}
//		}
//		for(int i = 0; i < str.length(); i++) {
//			if(str[i] != "X") {
//				count++;
//			}
//			System.out.println(count);
//		}
//	}
//}

