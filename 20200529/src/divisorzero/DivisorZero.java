package divisorzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisorZero {
	public static int[] make(int[] arr, int div) {
		int[] answer;
		// arr �迭 ���� div�� ������ �� ������ �������� �� ������ ����Ʈ ����
		List<Integer> divZero = new ArrayList<Integer>();
		
		// arr �迭 �� div�� ������ �������� �� ����Ʈ�� ����
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % div == 0) {
				divZero.add(arr[i]);
			}
		}
		// ����Ʈ ���̸�ŭ answer �迭 ����
		if(divZero.size() == 0) {
			// answer �迭�� ����� �� ���� �� -1 �Ҵ�
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[divZero.size()];
			// answer �迭�� ����Ʈ value ����
			for(int i = 0; i < answer.length; i++) {
				answer[i] = divZero.get(i);
			}
			// answer �迭�� ����� �� ���� �� ����
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
