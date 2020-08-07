package dartGame;
// 프로그래머스 다트 게임
public class DartGame {
	public int dart(String dartResult) {
		int answer = 0;
		int[] tmp = new int[3];
		int idx = 0;
		char[] cutStr = dartResult.toCharArray();
		
		for(int i = 1; i < cutStr.length; i++) {
			int num = Character.getNumericValue(cutStr[i-1]);
			
			if(i != 1 && 0 <= num && num >= 10) {
				idx++;
			}
			
			if(cutStr[i] == 'S') {
				tmp[idx] = num;
			} else if(cutStr[i] == 'D') {
				tmp[idx] = num * num;
			} else if(cutStr[i] == 'T') {
				tmp[idx] = num * num * num;
			} else if(cutStr[i] == '*') {
				if(idx != 0) {
					tmp[idx-1] = tmp[idx-1] * 2;
				}
				tmp[idx] = tmp[idx] * 2;
			} else {
				tmp[idx] = tmp[idx] * (-1);
			}
			System.out.println(tmp[idx]);
		}
		
		for(int i = 0; i < tmp.length; i++) {
			answer += tmp[i];
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
