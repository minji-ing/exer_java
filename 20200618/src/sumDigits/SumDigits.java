package sumDigits;
// ������ �� �ڸ��� �� ���ϱ�
public class SumDigits {
	public static void main(String args[]) {
		int answer = 0; // ����
		int n = 987; // �Է°�
		String strN = Integer.toString(n); // ������ ���ڿ��� ����ȯ
		char[] cutN = strN.toCharArray(); // ���ڿ��� ���� �迭�� �ڸ���
		
		for(int i = 0; i < cutN.length; i++) {
			// ���� �迭�� ������ ���� ������ ����ȯ�ϸ� �����ִ� �� �ݺ�
			answer += Character.getNumericValue(cutN[i]);
		}
		System.out.println(answer);	
	}
}
