package dartGame;

// 프로그래머스 다트 게임
public class DartGame {
	public int dart(String dartResult) {
		int answer = 0; // 다트 결과 저장 변수
		int[] temp = new int[3]; // 각 기회에서 얻은 점수 저장 배열 (최대 3번)
		int idx = -1;
		
		for(int i = 0; i < dartResult.length(); i++) {
			char dartChar = dartResult.charAt(i);
			int dartInt = Character.getNumericValue(dartChar);
			
			// 실제 얻은 점수일 경우
			if(0 <= dartInt && 9 >= dartInt && idx < 2) {
				if(dartInt == 1 && dartResult.charAt(i+1) == '0') {
					dartInt = 10;
				}
				idx++;
				temp[idx] = dartInt;
			} else {				
				if(dartChar == 'S') { // 얻은 점수에 1배수일 경우
					continue;
				} else if(dartChar == 'D') { // 얻은 점수에 2배수일 경우
					temp[idx] = temp[idx] * temp[idx];
				} else if(dartChar == 'T') { // 얻은 점수에 3배수일 경우
					temp[idx] = temp[idx] * temp[idx] * temp[idx];
				} else if(dartChar == '*') { // 보너스로 현재와 그 이전 기회 점수에 2배 하기
					for(int j = 0; j <= idx; j++) {
						temp[j] = temp[j] * 2;
					}
				} else if(dartChar == '#') { // 마이너스로 현재 점수에 -1 곱하기
					temp[idx] = temp[idx] * (-1);
				}
			}
		}
		for(int i = 0; i < temp.length; i++) {
			answer += temp[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String dartResult = "1S*2T*3S";
		DartGame dart = new DartGame();
		
		int answer = dart.dart(dartResult);
		
		System.out.println(answer);
	}
}
