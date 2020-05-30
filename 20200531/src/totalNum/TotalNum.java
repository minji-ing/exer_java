package totalNum;

// 두 정수 사이의 모든 정수의 합 구하기
public class TotalNum {
	// 두 정수 사이의 합 구하는 메소드
	public static long sum(int a, int b) {
		// 합 저장할 변수 선언
		long answer = 0;
		
		// a < b일 때
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		} else if(a == b) {
			// a = b일 때
			answer = a;
		} else {
			for(int i = b; i <= a; i++) {
				answer += i;
			}
		}
		return answer;
	}
}
