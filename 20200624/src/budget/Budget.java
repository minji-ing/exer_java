package budget;

import java.util.Arrays;
// �ִ��� ���� ������� ���� �Ҵ��ϱ�
public class Budget {
	public static void main(String[] args) {
		int[] d = {2,2,3,3}; // ���ϴ� ������ �迭
		int budget = 10; // �� ����
		int answer = 0; // �� �� �ִ� ��� ��
		int sum = 0; // �ִ��� ����鿡�� �ִ� ������ ��
		
		Arrays.sort(d); // ���ϴ� ���� ������������ ����
		
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
			answer ++;
			// ������� ������ �� ���ϰ� ��� ���� ī��Ʈ�ϴٰ�
			// ���ϴ� ������ ���� �� ���꺸�� Ŀ���� ���߰� ������ ��� -1
			if(sum > budget) {
				answer --;	
			}
		}		
		System.out.println(answer);
	}
}
