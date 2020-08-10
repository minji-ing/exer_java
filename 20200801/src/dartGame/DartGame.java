package dartGame;

// ���α׷��ӽ� ��Ʈ ����
public class DartGame {
	public int dart(String dartResult) {
		int answer = 0; // ��Ʈ ��� ���� ����
		int[] temp = new int[3]; // �� ��ȸ���� ���� ���� ���� �迭 (�ִ� 3��)
		int idx = -1;
		
		for(int i = 0; i < dartResult.length(); i++) {
			char dartChar = dartResult.charAt(i);
			int dartInt = Character.getNumericValue(dartChar);
			
			// ���� ���� ������ ���
			if(0 <= dartInt && 9 >= dartInt && idx < 2) {
				if(dartInt == 1 && dartResult.charAt(i+1) == '0') {
					dartInt = 10;
				}
				idx++;
				temp[idx] = dartInt;
			} else {				
				if(dartChar == 'S') { // ���� ������ 1����� ���
					continue;
				} else if(dartChar == 'D') { // ���� ������ 2����� ���
					temp[idx] = temp[idx] * temp[idx];
				} else if(dartChar == 'T') { // ���� ������ 3����� ���
					temp[idx] = temp[idx] * temp[idx] * temp[idx];
				} else if(dartChar == '*') { // ���ʽ��� ����� �� ���� ��ȸ ������ 2�� �ϱ�
					for(int j = 0; j <= idx; j++) {
						temp[j] = temp[j] * 2;
					}
				} else if(dartChar == '#') { // ���̳ʽ��� ���� ������ -1 ���ϱ�
					temp[idx] = temp[idx] * (-1);
				}
			}
		}
		for(int i = 0; i < temp.length; i++) {
			answer += temp[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		DartGame dart = new DartGame();
		
		int answer = dart.dart(dartResult);
		
		System.out.println(answer);
	}
}
