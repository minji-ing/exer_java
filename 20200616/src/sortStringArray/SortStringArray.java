package sortStringArray;

import java.util.Arrays;

public class SortStringArray {
	public static String[] sort(String[] s, int n) {
		String[] answer = new String[s.length]; // ���� ��ȯ �迭
		String[] chk = new String[s.length]; // n �ε��� ���� �迭
		
		// s �迭�� n �ε����� ���ڸ� �� ������ �ΰ� ��ü ���ڿ��� �ٿ� �迭 �ֱ�
		for(int i = 0; i < s.length; i++) {
			chk[i] = s[i].charAt(n)+s[i];
		}
		// �� ���ڸ��� n �ε��� ���ڿ��� �������� ����
		Arrays.sort(chk);
		
		// ������ temp �迭�� ���ڿ����� �� �ձ��ڸ� �����ϰ� �ٽ� ���� �迭�� �ֱ�
		for(int i = 0; i < s.length; i++) {
			answer[i] = chk[i].substring(1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] s = {"abcd", "abce", "cdx"};
		int n = 2;
		String[] answer = SortStringArray.sort(s, n);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
	}
}
