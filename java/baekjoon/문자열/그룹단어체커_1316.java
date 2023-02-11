package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 그룹단어체커_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(input.readLine());
		String[] str = new String[n];

		int count = 0;
		for(int i = 0; i < str.length; i++) {
			str[i] = input.readLine();
			
			for(int j = 0, int k = 1; j < str[i].length(); j++) {
				if(str[i].charAt(j) != str[i].charAt(k)) {
					if(str[i].charAt(j) == str[i].charAt(k)) {
						str[i] = "X";
						break;
					}
				}
			}
		}
		for(int i = 0; i < str.length; i++) {
			if(str[i] != "X") {
				count++;
			}
			System.out.println(count);
		}
	}
}

