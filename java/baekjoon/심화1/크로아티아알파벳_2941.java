package 심화1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class 크로아티아알파벳_2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String croAlpha[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = input.readLine();
		
		for(int i = 0; i < croAlpha.length; i++) {
			if(str.contains(croAlpha[i])) {
				str = str.replace(croAlpha[i], "!");
			}
		}
//		for(String val : croAlpha) {
//			str = str.replace(val, "!");
//		}
		System.out.println(str.length());
	}
}
