package functionDevelop;

import java.util.Arrays;

// 프로그래머스 기능 개발 (스택/큐)
public class FunctionDevelop {
	public int[] make(int[] progress, int[] speed) {
		int[] days = new int[progress.length];
		String count = "";
		
		for(int i = 0; i < progress.length; i++) {
			days[i] = (int)Math.ceil((double)(100 - progress[i]) / speed[i]);
//			System.out.println(days[i]);
		}
		
		for(int i = 0; i < days.length-1; i++) {
			if(days[i] < days[i+1]) {
				count += "1";
			} else {
				if(days.length <= 3) {
					count += "2";
				}
				for(int j = i+2; j < days.length; j++) {
					if(days[i] < days[j]) {
						count += Integer.toString(j);
					} else {
						count += Integer.toString(days.length - i);
					}
				}
			}
		}
		
		int[] answer = new int[count.length()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = Character.getNumericValue(count.charAt(i));
			System.out.println(answer[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] progress = {80, 15, 50};
		int[] speed = {20, 15, 10};
		
		FunctionDevelop dev = new FunctionDevelop();
		
		int[] answer = dev.make(progress, speed);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + "\t");
		}
		Arrays.toString(answer);
	}
}
