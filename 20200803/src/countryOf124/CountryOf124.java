package countryOf124;
// 프로그래머스 124나라
public class CountryOf124 {
	public static void main(String[] args) {
		String answer = ""; // 정답 저장 string
		int n = 20;
		int div = 0;		// n % 3 저장 변수
		
		while(n > 0) {
			div = n % 3;
			n /= 3;
			
			if(div == 0) {
				n--;
				div = 4;
			}
			answer = div + answer;
		}
		
		System.out.println(answer);
	}
}
