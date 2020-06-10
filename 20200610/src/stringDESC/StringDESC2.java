package stringDESC;

import java.util.Arrays;

// 프로그래머스 다른 사람 풀이
public class StringDESC2 {
	public static String descSort(String s) {
		// 입력받은 문자열 문자배열로 잘라 넣기
		char[] sol = s.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}
	
	public static void main(String[] args) {
		String result = StringDESC2.descSort("Zbcdefg");
		System.out.println(result);
	}
}
