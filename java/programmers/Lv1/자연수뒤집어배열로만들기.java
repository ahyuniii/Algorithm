package Lv1;


public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {

			  
			  //방법1
			  public int[] solution(long n) { 
			        String str = String.valueOf(n);  // 입력된 n을 String으로 형변환
			        int[] answer = new int[str.length()];  // 문자열 길이만큼 배열 생성
			        int idx = 0;
			        while(n > 0) {	
						answer[idx] = (int)(n % 10); // 자연수 n을 10으로 나눈 나머지 = 맨 뒷자리 수 
						n = n / 10; // 입력된 맨 뒷자리수를 제거하기 위해 10으로 나눠줌
						idx++;
					}
			        return answer;
			    }
			  //방법2
			  public int[] solution(long n) {
			        String str = String.valueOf(n); // 입력된 n을 String으로 형변환
			        
			        int[] answer = new int[str.length()]; // 문자열 길이만큼 배열 생성
			        
			        for(int i = 0; i < str.length(); i++) {
			        	// charAt() 메소드를 이용하여 배열 끝부터 맨앞자리 수부터 대입
						answer[str.length() - i - 1] = str.charAt(i) - '0'; 
					}
			        return answer;
			    }

			  //방법3
			  public int[] solution(long n) {
			    	String str = String.valueOf(n);
			        StringBuilder sb = new StringBuilder(str)
			        
			        sb = sb.reverse();
					String[] ss = sb.toString().split("");
						  
					int[] answer = new int[ss.length];
						  
					for(int i = 0; i < ss.length; i++) {
						answer[i] = Integer.parseInt(ss[i]);
					}
			        return answer;
	}

}

