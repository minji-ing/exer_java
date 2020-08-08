package dartGame;

import java.util.HashMap;
import java.util.Map;

// 프로그래머스 다트 게임
public class DartGame {
	public int dart(String dartResult) {
		int answer = 0;
		Map<Integer, Integer> tmp = new HashMap<Integer, Integer>(3);
		
		for(int i = 0; i < dartResult.length(); i++) {
			char dartChar = dartResult.charAt(i);
			int dartInt = Character.getNumericValue(dartChar);
			
			System.out.println(dartChar + " : " + dartInt);
			if(0 <= dartInt && 9 >= dartInt) {
				if(dartInt == 1 && dartResult.charAt(i+1) == '0') {
					dartInt = 10;
				}
				tmp.put(i, dartInt);
			}
			
//			else {
//				int num = tmp.get(i-1);
//				
//				if(dartChar == 'S') {
//					continue;
//				} else if(dartChar == 'D') {
//					tmp.put(i-1, num * num);
//				} else if(dartChar == 'T') {
//					tmp.put(i-1, num * num * num);
//				} else {
//					continue;
//				}
//			}
		}
		for(int i = 0; i < tmp.size(); i++)	{
			
			System.out.println(tmp.get(i));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		DartGame dart = new DartGame();
		
		int answer = dart.dart(dartResult);
		
//		System.out.println(answer);
	}
}
