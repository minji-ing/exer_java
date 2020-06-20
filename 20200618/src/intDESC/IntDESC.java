package intDESC;

import java.util.Arrays;

// 정수 내림차순으로 배치하기
public class IntDESC {
	public static void main(String[] args) {
		long n = 118372; // 입력값
		int len = Long.toString(n).length(); // 입력값 길이 구하기
		int[] cut = new int[len]; // 입력값 한 자릿수씩 잘라넣을 배열 선언
		String answer = "";
		
		for(int i = 0; i < len; i++) {
			cut[i] = (int)(n%10); // 입력값 한 자릿수씩 배열에 저장
			n = n/10; // 입력값 자릿수 줄이기
		}
		
		// 한 자릿수씩 입력한 배열 비교하여 내림차순 정렬
		for(int i = 0; i < len-1; i++) {
			for(int j = i+1; j < len; j++) {
				if(cut[i] < cut[j]) {
					int temp = cut[i];
					cut[i] = cut[j];
					cut[j] = temp;
				}	
			}
		}
		System.out.print(Integer.parseInt(answer));
	}
}
