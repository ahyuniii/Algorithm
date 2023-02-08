package 문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 다이얼_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String str = input.readLine();
		int time = 0;;
		for(int i = 0; i < str.length(); i++) {
			time += 2;
			if('A' <= str.charAt(i) && str.charAt(i) <= 'C') {
				time += 1;
			} else if(str.charAt(i) <= 'F') {
				time += 2;
			} else if(str.charAt(i) <= 'I') {
				time += 3;
			} else if(str.charAt(i) <= 'L') {
				time += 4;
			} else if(str.charAt(i) <= 'O') {
				time += 5;
			} else if(str.charAt(i) <= 'S') {
				time += 6;
			} else if(str.charAt(i) <= 'V') {
				time += 7;
			} else if(str.charAt(i) <= 'Z') {
				time += 8;
			}

			//			switch(str.charAt(i)) {
			//			case 'A', 'B', 'C' : time += 1; break;
			//			case 'D', 'E', 'F' : time += 2; break;
			//			case 'G', 'h', 'I' : time += 3; break;
			//			case 'J', 'K', 'L' : time += 4; break;
			//			case 'M', 'N', 'O' : time += 5; break;
			//			case 'P', 'Q', 'R', 'S' : time += 6; break;
			//			case 'T', 'U', 'V' : time += 7; break;
			//			case 'W', 'X', 'Y', 'Z' : time += 8; break;
			//}
		}
		System.out.println(time);
	}
}

