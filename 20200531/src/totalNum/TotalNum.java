package totalNum;

// �� ���� ������ ��� ������ �� ���ϱ�
public class TotalNum {
	// �� ���� ������ �� ���ϴ� �޼ҵ�
	public static long sum(int a, int b) {
		// �� ������ ���� ����
		long answer = 0;
		
		// a < b�� ��
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		} else if(a == b) {
			// a = b�� ��
			answer = a;
		} else {
			for(int i = b; i <= a; i++) {
				answer += i;
			}
		}
		return answer;
	}
}
