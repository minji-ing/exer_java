package changeString;

// 문자열에서 단어별 홀수번째 알파벳은 소문자로, 짝수번째 알파벳은 대문자로 변환
public class ChangeString {
	public static String change(String s) {
		String answer = ""; // 정답 string
		int idx = 0; // 각 단어의 인덱스
		
		// 전체 문자열만큼 반복
		for(int i = 0; i < s.length(); i++) {
			String cut = s.substring(i, i+1); // 문자열 한 글자씩 자르기
			if(cut.equals(" ")) { // 자른 글자가 공백일 경우 그대로 넣고 단어 인덱스 초기화
				answer += cut;
				idx = 0;
			} else {
				if(idx%2 == 0) { // 단어 인덱스가 짝수일 경우
					answer += cut.toUpperCase(); // 자른 글자 대문자로 변환 후 저장
				} else { // 단어 인덱스가 홀수일 경우
					answer += cut.toLowerCase(); // 자른 글자 소문자로 변환 후 저장
				}
				idx++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = ChangeString.change(s);
		System.out.print(answer);
	}
}
