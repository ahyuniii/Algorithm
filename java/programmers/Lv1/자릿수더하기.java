package Lv1;

public class 자릿수더하기 {

	public static void main(String[] args) {
		public int solution(int n) {
			int answer = 0;
			// String N = Integer.toString(n);	//charAt()메소드를 사용하기 위해 정수 n을 String으로 형변환
			// for(int i = 0; i < N.length();i++) {
			//     //answer += N.charAt(i) - '0';	//'0'의 아스키코드 십진수 값(48)을 빼주어 int로 형변환
			//     //answer += Character.getNumericValue(N.charAt(i));
						//Character.getNumericValue(char)메소드를 이용하여 char(i)를 int로 형변환
			// }
			while(n != 0){
				answer += n % 10;	// 일의 자리 숫자를 answer에 더함
				n /= 10;			// n을 10으로 나누어 몫을 n에 대입, 일의 자리 숫자 탈락
			}
			return answer;
		}
	}
}