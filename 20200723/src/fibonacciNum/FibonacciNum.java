package fibonacciNum;

// 프로그래머스 피보나치 수
public class FibonacciNum {
	public static void main(String[] args) {
		int n = 31; // 피보나치 수의 순서
		int answer = 0; // 결과값
		
		if(n <= 2) { // 피보나치 수가 2번째 이하일 경우 answer은 1반환
			answer = 1;
		} else {
			int n1 = 0; // 0번째 피보나치 수
			int n2 = 1; // 1번째 피보나치 수
			
			// 2번째부터 n번째까지 피보나치 수 계산 위한 loop. 모든 피보나치 수를 1234567로 나눈 나머지를 저장
			for(int i = 2; i <= n; i++) {
				answer = (n1 + n2) % 1234567;
				n1 = n2 % 1234567;
				n2 = answer % 1234567;
			}
		}
		System.out.println(answer);
	}
}
