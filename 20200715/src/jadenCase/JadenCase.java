package jadenCase;
// ���α׷��ӽ� JadenCase ���ڿ� �����
public class JadenCase {
	public static String make(String s) {
		String[] cutS = s.toLowerCase().split(" "); // ��� �ҹ��ڷ� ���� �� string ���� �������� �߶�  �迭�� �ֱ�
		String answer = ""; // ���� ���� string ����
		
		// ����� �ڸ� �迭 loop
		for(int i = 0; i < cutS.length; i++) {
			if(cutS[i].equals("")) { // ���ڿ� s �߰��� ���� �������� ���� ��� �ٷ� ���� ����
				answer += " ";
				continue;
			} else {
				cutS[i] = cutS[i].toUpperCase().substring(0,1)+cutS[i].substring(1); // �ܾ��� ��� ù���ڸ� ©�� �빮�ڷ� ��ȯ �� ������ ���� �̾ ����
				answer += cutS[i];
				
				if(i < cutS.length-1) { // �迭�� ������ �ܾ� ������
					answer += " ";	// �� �ܾ� ���� ���� ���� ����
				}
			}
		}
		
		if(s.length() != cutS.length) { // ���ڿ� s �� �ڿ� ���Ⱑ ���� ���
			int diff = s.length() - answer.length(); // ���ڿ� s�� �� answer�� ���� �� ��ŭ answer �� �ڿ� ���� ����
			for(int i = 0; i < diff; i++) {
				answer += " ";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "3people  unFollowed me ";
//		String s = "for the last week";
		String answer = make(s);
		System.out.println(answer);
		
	}
}
