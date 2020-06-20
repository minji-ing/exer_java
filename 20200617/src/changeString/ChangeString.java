package changeString;

// ���ڿ����� �ܾ Ȧ����° ���ĺ��� �ҹ��ڷ�, ¦����° ���ĺ��� �빮�ڷ� ��ȯ
public class ChangeString {
	public static String change(String s) {
		String answer = ""; // ���� string
		int idx = 0; // �� �ܾ��� �ε���
		
		// ��ü ���ڿ���ŭ �ݺ�
		for(int i = 0; i < s.length(); i++) {
			String cut = s.substring(i, i+1); // ���ڿ� �� ���ھ� �ڸ���
			if(cut.equals(" ")) { // �ڸ� ���ڰ� ������ ��� �״�� �ְ� �ܾ� �ε��� �ʱ�ȭ
				answer += cut;
				idx = 0;
			} else {
				if(idx%2 == 0) { // �ܾ� �ε����� ¦���� ���
					answer += cut.toUpperCase(); // �ڸ� ���� �빮�ڷ� ��ȯ �� ����
				} else { // �ܾ� �ε����� Ȧ���� ���
					answer += cut.toLowerCase(); // �ڸ� ���� �ҹ��ڷ� ��ȯ �� ����
				}
				idx++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = ChangeString.change(s);
		System.out.print(answer);
	}
}
