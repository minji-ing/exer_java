package stringDESC;

import java.util.Arrays;
import java.util.Collections;

public class StringDESC {
	public static String make(String s) {
		String answer = "";
		int len = s.length(); // 입력받은 문자열 길이
		String[] cutArr = new String[len]; // 문자열 길이만큼 배열 생성
		
		// 생성한 배열에 문자열 하나씩 잘라서 넣기
		for(int i = 0; i < len; i++) {
			if(i == len-1) {
				cutArr[i] = s.substring(i);
			} else {
				cutArr[i] = s.substring(i, i+1);
			}
		}
		Arrays.sort(cutArr); // 문자열 하나씩 넣은 배열 오름차순 정렬
		// 오름차순 정렬한 배열 리스트로 바꿔서 역방향으로 뒤집기
		Collections.reverse(Arrays.asList(cutArr));
		// 내림차순 정렬된 배열 반복문으로 answer에 넣기
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
