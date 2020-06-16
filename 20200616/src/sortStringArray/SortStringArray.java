package sortStringArray;

import java.util.Arrays;

public class SortStringArray {
	public static String[] sort(String[] s, int n) {
		String[] answer = new String[s.length]; // 정답 반환 배열
		String[] chk = new String[s.length]; // n 인덱스 관련 배열
		
		// s 배열의 n 인덱스의 글자를 맨 앞으로 두고 전체 문자열을 붙여 배열 넣기
		for(int i = 0; i < s.length; i++) {
			chk[i] = s[i].charAt(n)+s[i];
		}
		// 맨 앞자리인 n 인덱스 글자열을 기준으로 정렬
		Arrays.sort(chk);
		
		// 정렬한 temp 배열의 문자열에서 맨 앞글자만 제거하고 다시 정답 배열에 넣기
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
