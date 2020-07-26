package fibonacciNum;

// ���α׷��ӽ� �Ǻ���ġ ��
public class FibonacciNum {
	public static void main(String[] args) {
		int n = 31; // �Ǻ���ġ ���� ����
		int answer = 0; // �����
		
		if(n <= 2) { // �Ǻ���ġ ���� 2��° ������ ��� answer�� 1��ȯ
			answer = 1;
		} else {
			int n1 = 0; // 0��° �Ǻ���ġ ��
			int n2 = 1; // 1��° �Ǻ���ġ ��
			
			// 2��°���� n��°���� �Ǻ���ġ �� ��� ���� loop. ��� �Ǻ���ġ ���� 1234567�� ���� �������� ����
			for(int i = 2; i <= n; i++) {
				answer = (n1 + n2) % 1234567;
				n1 = n2 % 1234567;
				n2 = answer % 1234567;
			}
		}
		System.out.println(answer);
	}
}
