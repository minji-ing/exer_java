package maxAndminCommonNum;

import java.util.Arrays;

public class MaxAndMinComNum {
	public static void main(String[] args) {
		int n = 6;
		int m = 14;
		int[] answer = new int[2];
		
		// 두 숫자 크기 비교하여 정렬
		if(m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		// m이 n의 배수일 경우
		if(m%n == 0) {
			answer[0] = n;
			answer[1] = m;
		} else {
			// m이 n의 배수는 아니지만 나누어지는 수가 있는 경우
			for(int i = 1; i < n; i++) {
				if(n%i == 0 && m%i == 0) {
					answer[0] = i;
					answer[1] = (n*m)/i;
				}
			}
		}
	
		System.out.print(Arrays.toString(answer));
	}
}
