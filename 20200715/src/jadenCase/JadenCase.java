package jadenCase;
// ���α׷��ӽ� JadenCase ���ڿ� �����
public class JadenCase {
	public static String make(String s) {
		String[] cutS = s.split(" "); // string ���� �������� �߶� �迭�� �ֱ�
		String answer = ""; // ���� ���� string ����
		
		// ����� �ڸ� �迭 loop
		for(int i = 0; i < cutS.length; i++) {
			for(int j = 0; j < cutS[i].length(); j++) { // �迭�� �� �� �ܾ ���̸�ŭ loop
				if(j == 0) { // �ܾ��� ù ������ ���
					if(cutS[i].charAt(j) > 96 && cutS[i].charAt(j) < 123) { // ù ���ڰ� �ҹ����� ���
						answer += (char)((int)cutS[i].charAt(j)-32); // �빮�ڷ� ��ȯ
					} else {
						answer += cutS[i].charAt(j); // �� ���� ��� (ex)����, �빮�� ��) �״�� ����
					}
				} else { // ù ���� ���� ������ ���
					if(cutS[i].charAt(j) > 64 && cutS[i].charAt(j) < 91) { // ���� ���ڰ� �빮���� ���
						answer += (char)((int)cutS[i].charAt(j)+32); // �ҹ��ڷ� ��ȯ
					} else {
						answer += cutS[i].charAt(j); // �� ���� ��� (ex)����, �빮�� ��) �״�� ����
					}
				}
			}
			if(i < cutS.length-1) { // �迭�� ������ �ܾ� ������
				answer += " ";	// �� �ܾ� ���� ���� ���� ����
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
//		String s = "3people unFollowed me";
		String s = "for the last week";
		String answer = make(s);
		System.out.println(answer);
		
	}
}
