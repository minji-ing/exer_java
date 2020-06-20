package sumDigits;
// 정수의 각 자리수 합 구하기
public class SumDigits {
	public static void main(String args[]) {
		int answer = 0; // 정답
		int n = 987; // 입력값
		String strN = Integer.toString(n); // 정수를 문자열로 형변환
		char[] cutN = strN.toCharArray(); // 문자열을 문자 배열로 자르기
		
		for(int i = 0; i < cutN.length; i++) {
			// 문자 배열의 각각의 값을 정수로 형변환하며 더해주는 것 반복
			answer += Character.getNumericValue(cutN[i]);
		}
		System.out.println(answer);	
	}
}
