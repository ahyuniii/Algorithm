package 함수;

public class 셀프넘버_4673 {
	
	public static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum = sum + (n % 10);
			n = n/ 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		boolean[] a = new boolean[10001];
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				a[n] = true;
			}
		}
		for(int i = 1; i < 10001; i++) {
			if(a[i] == false) {
				System.out.println(i);
			}
		}
	}

}
