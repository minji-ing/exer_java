package divisorzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorZero {
	public static int[] make(int[] arr, int div) {
		int[] answer;
		// arr 배열 값을 div로 나눴을 때 나누어 떨어지는 값 저장할 리스트 선언
		List<Integer> divZero = new ArrayList<Integer>();
		
		// arr 배열 값 div로 나누어 떨어지는 값 리스트에 저장
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % div == 0) {
				divZero.add(arr[i]);
			}
		}
		// 리스트 길이만큼 answer 배열 생성
		if(divZero.size() == 0) {
			// answer 배열에 저장된 값 없을 때 -1 할당
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[divZero.size()];
			// answer 배열에 리스트 value 저장
			for(int i = 0; i < answer.length; i++) {
				answer[i] = divZero.get(i);
			}
			// answer 배열에 저장된 값 있을 때 정렬
			Arrays.sort(answer);
		}
		return answer;
	}
	
	public static void print(int[] arr) {
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
