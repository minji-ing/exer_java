package stringDESC;

import java.util.Arrays;

// ���α׷��ӽ� �ٸ� ��� Ǯ��
public class StringDESC2 {
	public static String descSort(String s) {
		// �Է¹��� ���ڿ� ���ڹ迭�� �߶� �ֱ�
		char[] sol = s.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}
	
	public static void main(String[] args) {
		String result = StringDESC2.descSort("Zbcdefg");
		System.out.println(result);
	}
}
