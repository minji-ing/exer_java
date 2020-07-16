package jadenCase;
// 프로그래머스 JadenCase 문자열 만들기
public class JadenCase {
	public static String make(String s) {
		String[] cutS = s.split(" "); // string 띄어쓰기 기준으로 잘라서 배열에 넣기
		String answer = ""; // 정답 저장 string 선언
		
		// 띄어쓰기로 자른 배열 loop
		for(int i = 0; i < cutS.length; i++) {
			for(int j = 0; j < cutS[i].length(); j++) { // 배열의 값 한 단어를 길이만큼 loop
				if(j == 0) { // 단어의 첫 글자일 경우
					if(cutS[i].charAt(j) > 96 && cutS[i].charAt(j) < 123) { // 첫 글자가 소문자인 경우
						answer += (char)((int)cutS[i].charAt(j)-32); // 대문자로 전환
					} else {
						answer += cutS[i].charAt(j); // 그 외의 경우 (ex)숫자, 대문자 등) 그대로 저장
					}
				} else { // 첫 글자 이후 글자의 경우
					if(cutS[i].charAt(j) > 64 && cutS[i].charAt(j) < 91) { // 이후 글자가 대문자인 경우
						answer += (char)((int)cutS[i].charAt(j)+32); // 소문자로 전환
					} else {
						answer += cutS[i].charAt(j); // 그 외의 경우 (ex)숫자, 대문자 등) 그대로 저장
					}
				}
			}
			if(i < cutS.length-1) { // 배열의 마지막 단어 전까지
				answer += " ";	// 한 단어 저장 이후 띄어쓰기 저장
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
