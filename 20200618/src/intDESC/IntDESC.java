package intDESC;

import java.util.Arrays;

// ���� ������������ ��ġ�ϱ�
public class IntDESC {
	public static void main(String[] args) {
		long n = 118372; // �Է°�
		int len = Long.toString(n).length(); // �Է°� ���� ���ϱ�
		int[] cut = new int[len]; // �Է°� �� �ڸ����� �߶���� �迭 ����
		String answer = "";
		
		for(int i = 0; i < len; i++) {
			cut[i] = (int)(n%10); // �Է°� �� �ڸ����� �迭�� ����
			n = n/10; // �Է°� �ڸ��� ���̱�
		}
		
		// �� �ڸ����� �Է��� �迭 ���Ͽ� �������� ����
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
