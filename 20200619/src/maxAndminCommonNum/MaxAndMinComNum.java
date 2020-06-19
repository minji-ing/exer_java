package maxAndminCommonNum;

import java.util.Arrays;

public class MaxAndMinComNum {
	public static void main(String[] args) {
		int n = 6;
		int m = 14;
		int[] answer = new int[2];
		
		// �� ���� ũ�� ���Ͽ� ����
		if(m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		// m�� n�� ����� ���
		if(m%n == 0) {
			answer[0] = n;
			answer[1] = m;
		} else {
			// m�� n�� ����� �ƴ����� ���������� ���� �ִ� ���
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
