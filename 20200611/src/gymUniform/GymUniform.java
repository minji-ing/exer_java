package gymUniform;
// ü���� �����ֱ�
public class GymUniform {
	public static int rent(int n, int[] lost, int[] reverse) {
		// ü���� �ִ� ��� ��
		int answer = n - lost.length;
		
		// ���� ���� ����� ���� �ִ� ��� ���������� Ȯ��
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reverse.length; j++) {
				if(lost[i] == reverse[j]) {
					lost[i] = -10;
					reverse[j] = -10;
					answer++;
				}
			}
		}
		// ���� �ִ� ����� ���� ������� �����ְ� �� �����ο� ī��Ʈ
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reverse.length; j++) {
				if(lost[i] == reverse[j]-1 || 
						lost[i] == reverse[j]+1) {
					answer++;
					reverse[j] = -10;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] lost = {1,2,6};
		int[] reverse = {1,2,5};
		int result = GymUniform.rent(7, lost, reverse);
		System.out.println(result);
		// �� �ڵ尡 �ٵ� ���α׷��ӽ������� ���з� ����....
	}
}
