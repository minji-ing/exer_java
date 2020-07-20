package jadenCase;
// 프로그래머스 JadenCase 문자열 만들기
public class JadenCase {
	public static String make(String s) {
		String[] cutS = s.toLowerCase().split(" "); // 모두 소문자로 만든 후 string 띄어쓰기 기준으로 잘라서  배열에 넣기
		String answer = ""; // 정답 저장 string 선언
		
		// 띄어쓰기로 자른 배열 loop
		for(int i = 0; i < cutS.length; i++) {
			if(cutS[i].equals("")) { // 문자열 s 중간에 띄어쓰기 연속으로 있을 경우 바로 띄어쓰기 저장
				answer += " ";
				continue;
			} else {
				cutS[i] = cutS[i].toUpperCase().substring(0,1)+cutS[i].substring(1); // 단어의 경우 첫글자만 짤라 대문자로 변환 후 나머지 문자 이어서 저장
				answer += cutS[i];
				
				if(i < cutS.length-1) { // 배열의 마지막 단어 전까지
					answer += " ";	// 한 단어 저장 이후 띄어쓰기 저장
				}
			}
		}
		
		if(s.length() != cutS.length) { // 문자열 s 맨 뒤에 띄어쓰기가 있을 경우
			int diff = s.length() - answer.length(); // 문자열 s와 답 answer의 길이 차 만큼 answer 맨 뒤에 띄어쓰기 저장
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
