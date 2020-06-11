package gymUniform;
// ü���� �����ֱ� �ٸ� ��� �ڵ�
public class GymUniformAnother {
	public static int rent(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int [] std = new int[n+1]; // 1~n���� �ε��� ���
		
		// std �迭 �ʱ�ȭ
		for(int i = 1; i <= n; i++) {
			std[i] = 1;
		}
		// ���ϸ��� �л� 0���� ����
		for(int l : lost) {
			std[l]--;
		}
		// ���� �ִ� �л� 2�� ����
		for(int r : reserve) {
			std[r]++;
		}
		
		// ���� ģ������ �����ֱ�
		for(int i = 1; i <= n; i++) {
			if(std[i] == 0) {
				if(i+1 <= n && std[i+1] == 2) {
					std[i+1]--;
					std[i]++;
				} else if(i-1 >= 1 && std[i-1] == 2) {
					std[i-1]--;
					std[i]++;
				}
			}
		}
		
		// std �迭 ���� 1 �̻��� �л� üũ
		for(int i = 1; i <= n; i++) {
			if(std[i] >= 1) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lost = {2,4};
		int[] reverse = {1,3,5};
		int result = GymUniformAnother.rent(5, lost, reverse);
		System.out.println(result);
	}
}
