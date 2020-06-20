package reverseIntToArray;
// 정수의 각 자리수 거꾸로 출력하기
public class ReverseIntToArray {
	public static void main(String[] args) {
		long n = 123456; // 입력값
		int len = Long.toString(n).length(); // 정수 문자열로 바꿔 길이체크
		int[] answer = new int[len]; // 정수 자리수 만큼 정답 배열 생성
		
		for(int i = 0; i < answer.length; i++) {
			// 정답 배열에 입력값 나누기 10 했을 때 나머지 입력
			answer[i] = (int)(n%10);
			// 입력값 자리수 줄여주기
			n = n/10;
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
	}
}
