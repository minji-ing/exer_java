package collatz;
// 콜라츠 추측하기
public class Collatz {
	public static void main(String[] args) {
		long n = 626331; // 입력값
		int answer = 0; // 출력값
		
		// 입력값인 n이 1이 될때까지 반복
		while(n > 1) {
			// 반복 횟수가 500번이면 -1을 반환
			if(answer == 500) {
				answer = -1;
				break;
			} else {
				// 입력값 n이 짝수라면 나누기 2를 해줌
				if(n%2 == 0) {
					n = n/2;
				} else {
					// 입력값 n이 홀수라면 곱하기 3 더하기 1을 해줌
					n = n*3+1;
				}
				answer++;
			}
		}
		System.out.println(answer);
	}
}
