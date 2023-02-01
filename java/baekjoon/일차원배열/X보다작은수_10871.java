package 일차원배열;
import java.util.Scanner;

public class X보다작은수_10871 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();  // N = 배열 요소의 갯수
		int X = input.nextInt();  // X = X보다 작은 수 구하기
		// 배열 입력
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		// X보다 작은 수 출력하기
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
