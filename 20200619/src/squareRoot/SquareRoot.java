package squareRoot;
// 제곱근 판별하기
public class SquareRoot {
	public long find(long n) {
		long answer = 0;
		// n의 제곱근 반환
		long i = (long)Math.sqrt(n);
		// Math.sqrt는 double 형태로 반환하기 때문에 long 형변환 시
		// 정수 제곱근을 갖지 않는 경우는 n과 차이 발생
		if(i*i == n) {
			answer = (i+1)*(i+1);
		} else {
			answer = -1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		long n = 121;
		SquareRoot root = new SquareRoot();
		long answer = root.find(n);
		System.out.print(answer);
	}
}
