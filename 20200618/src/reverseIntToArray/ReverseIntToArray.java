package reverseIntToArray;
// ������ �� �ڸ��� �Ųٷ� ����ϱ�
public class ReverseIntToArray {
	public static void main(String[] args) {
		long n = 123456; // �Է°�
		int len = Long.toString(n).length(); // ���� ���ڿ��� �ٲ� ����üũ
		int[] answer = new int[len]; // ���� �ڸ��� ��ŭ ���� �迭 ����
		
		for(int i = 0; i < answer.length; i++) {
			// ���� �迭�� �Է°� ������ 10 ���� �� ������ �Է�
			answer[i] = (int)(n%10);
			// �Է°� �ڸ��� �ٿ��ֱ�
			n = n/10;
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
	}
}
