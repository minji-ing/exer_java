package dartGame;
// 프로그래머스 다트 게임
public class DartGame {
	public int dart(String dartResult) {
		int answer = 0;
		char[] cutStr = dartResult.toCharArray();
		
		for(int i = 1; i < cutStr.length; i++) {
			if(cutStr[i] == 'S') {
				answer += cutStr[i-1];
			} else if(cutStr[i] == 'D') {
				answer += cutStr[i-1] * cutStr[i-1];
			} else if(cutStr[i] == 'T') {
				answer += cutStr[i-1] * cutStr[i-1] * cutStr[i-1];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		DartGame dart = new DartGame();
		
		int answer = dart.dart(dartResult);
		
		System.out.println(answer);
	}
}
