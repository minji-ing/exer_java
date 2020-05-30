package lotto;

import java.util.Arrays;

public class Lotto {
	// ���� �ٸ� 6���� ������ ������ �迭 ����
	int[] lotto;
	
	public Lotto() {
		lotto = new int[6];
	}	
	public int[] make() {
		for(int i = 1; i <= 6; i++) {
			// 1~45 ���� ������ ���� �̱�
			int num = (int)(Math.random()*45)+1;
			// ù ��° ���� ���ڴ� �ٷ� �迭�� ����
			if(i == 1) {
				lotto[i-1] = num;
			} else {
				// �� ��° ���� ���ں��ʹ� �迭�� ��ġ�� ������ Ȯ�� �� ����
				if(chk(lotto, num) == true) {
					lotto[i-1] = num;
				}
			}
		}
		// 6�� ä�� �迭 ���������� ����
		Arrays.sort(lotto);
		
		return lotto;
	}
	
	// ���� ���ڿ� �迭 ���� ���ڰ� ��ġ�� ������ Ȯ�� �ϴ� �޼ҵ�
	public static boolean chk(int[] arr, int num) {
		boolean result = true;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				result = false;
			}
		}
		return result;
	}
	
	// �迭 ��� �޼ҵ�
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
