package collatz;
// �ݶ��� �����ϱ�
public class Collatz {
	public static void main(String[] args) {
		long n = 626331; // �Է°�
		int answer = 0; // ��°�
		
		// �Է°��� n�� 1�� �ɶ����� �ݺ�
		while(n > 1) {
			// �ݺ� Ƚ���� 500���̸� -1�� ��ȯ
			if(answer == 500) {
				answer = -1;
				break;
			} else {
				// �Է°� n�� ¦����� ������ 2�� ����
				if(n%2 == 0) {
					n = n/2;
				} else {
					// �Է°� n�� Ȧ����� ���ϱ� 3 ���ϱ� 1�� ����
					n = n*3+1;
				}
				answer++;
			}
		}
		System.out.println(answer);
	}
}
