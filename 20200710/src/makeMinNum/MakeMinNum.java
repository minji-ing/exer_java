package makeMinNum;

import java.util.Arrays;
// 길이가 같은 배열 두 개의 값을 조합하여 최솟값 만들기
public class MakeMinNum {
	public static int make(int[] a, int[] b) {
		int answer = 0; // 최솟값 저장하는 변수
		// a,b 두 배열 오름차순으로 정렬
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++) {
			// (a 배열 작은 수 -> 큰 수) * (b 배열 큰 수 -> 작은 수)
			answer += a[i]*b[b.length-1-i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = {3,4};
		int answer = MakeMinNum.make(a, b);
		System.out.println(answer);
	}
}
