package stringDESC;

import java.util.Arrays;
import java.util.Collections;

public class StringDESC {
	public static String make(String s) {
		String answer = "";
		int len = s.length(); // �Է¹��� ���ڿ� ����
		String[] cutArr = new String[len]; // ���ڿ� ���̸�ŭ �迭 ����
		
		// ������ �迭�� ���ڿ� �ϳ��� �߶� �ֱ�
		for(int i = 0; i < len; i++) {
			if(i == len-1) {
				cutArr[i] = s.substring(i);
			} else {
				cutArr[i] = s.substring(i, i+1);
			}
		}
		Arrays.sort(cutArr); // ���ڿ� �ϳ��� ���� �迭 �������� ����
		// �������� ������ �迭 ����Ʈ�� �ٲ㼭 ���������� ������
		Collections.reverse(Arrays.asList(cutArr));
		// �������� ���ĵ� �迭 �ݺ������� answer�� �ֱ�
		for(int i = 0; i < len; i++) {
			answer += cutArr[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String result = StringDESC.make(s);
		System.out.println(result);
	}
}
