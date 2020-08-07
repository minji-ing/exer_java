package dartGame;
// 프로그래머스 다트 게임
public class DartGame {
	public int dart(String dartResult) {
		int answer = 0;
		char[] cutStr = dartResult.toCharArray();
		
		for(int i = 1; i < cutStr.length; i++) {
			int num = Character.getNumericValue(cutStr[i-1]);
			
			if(cutStr[i] == 'S') {
				answer += num;
			} else if(cutStr[i] == 'D') {
				answer += num * num;
			} else if(cutStr[i] == 'T') {
				answer += num * num * num;
			} else if(cutStr[i] == '*') {
				answer = answer * 2;
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
