package lotto;

import java.util.Arrays;

public class Lotto {
	// 서로 다른 6개의 정수를 저장할 배열 선언
	int[] lotto;
	
	public Lotto() {
		lotto = new int[6];
	}	
	public int[] make() {
		for(int i = 1; i <= 6; i++) {
			// 1~45 사이 임의의 정수 뽑기
			int num = (int)(Math.random()*45)+1;
			// 첫 번째 뽑은 숫자는 바로 배열에 저장
			if(i == 1) {
				lotto[i-1] = num;
			} else {
				// 두 번째 뽑은 숫자부터는 배열과 겹치는 수인지 확인 후 저장
				if(chk(lotto, num) == true) {
					lotto[i-1] = num;
				}
			}
		}
		// 6개 채운 배열 증가순으로 정렬
		Arrays.sort(lotto);
		
		return lotto;
	}
	
	// 뽑은 숫자와 배열 안의 숫자가 겹치는 수인지 확인 하는 메소드
	public static boolean chk(int[] arr, int num) {
		boolean result = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				result = false;
			}
		}
		return result;
	}
	
	// 배열 출력 메소드
	public void print(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i]+"]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
}
