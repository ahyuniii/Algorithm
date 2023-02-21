package 심화1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class 킹퀸룩비숍나이트폰_3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String num = input.readLine();
		//		StringTokenizer newNum = new StringTokenizer(num, " ");
		int[] set = {1, 1, 2, 2, 2, 8}; //각 킹, 퀸, 룩, 비숍, 나이트, 폰의 올바른 세트 갯수

		//		for(int i = 0; i < set.length; i++) {
		//			System.out.println(set[i] - Integer.parseInt(newNum.nextToken()));
		//		}
		//		

		String[] arr = num.split(" "); //입력된 num을 공백으로 잘라 배열에 저장
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = Integer.parseInt(arr[i]);
		}

		for(int i = 0; i < arr.length; i++) {
			newArr[i] = set[i] - newArr[i];
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
}
