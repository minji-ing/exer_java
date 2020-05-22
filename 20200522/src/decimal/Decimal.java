package decimal;

public class Decimal {
	
	public int solution(int n) {
		int answer = 0;
		int[] num = new int[n+1];
		
		//2���� n������ ���� �迭�� �Է�
		for(int i = 2; i <= n; i++) {
			num[i] = i;
		}
		//2���� ���� ����� 0���� ����. ���� 0�̸� continue
		for(int i = 2; i <= n; i++) {
			if(num[i] == 0) {
				continue;
			}
			for(int j = 2*i; j <= n; j += i) {
				num[j] = 0;
			}
		}
		
		//�迭���� 0�� �ƴ� �͵��� ���� count
		for(int i = 0; i < num.length; i++) {
			if(num[i] != 0) {
				answer++;
			}
		}
		return answer;
	}
}
