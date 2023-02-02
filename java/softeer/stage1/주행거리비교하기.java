package stage1;

import java.util.Scanner;

public class 주행거리비교하기 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt(); // A의 주행거리
		int B = input.nextInt(); // B의 주행거리
		
		if(A > B) {
			System.out.println('A');
		} else if(A < B) {
			System.out.println('B');
		} else {
			System.out.println("same");
		}
	}
}