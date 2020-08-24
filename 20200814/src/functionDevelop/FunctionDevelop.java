package functionDevelop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 기능 개발 (스택/큐)
public class FunctionDevelop {
	public int[] make(int[] progress, int[] speed) {
		int[] days = new int[progress.length]; // 기능별 배포까지 추가로 필요한 날짜 계산 배열
		List<Integer> n = new ArrayList<Integer>();
		int count = 1;
		
		// 배포까지 필요한 날짜 계산
		for(int i = 0; i < progress.length; i++) {
			days[i] = (int)Math.ceil((double)(100 - progress[i]) / speed[i]);
		}
		
		int max = days[0];
		
		for(int i = 1; i < days.length; i++) {
			if(days[i] > max) {
				n.add(count);
				max = days[i];
				count = 1;
			} else {
				count++;
				continue;
			}
		}
		n.add(count);
		
		int[] answer = new int[n.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = n.get(i);
		}

		return answer;
	}
	
	public static void main(String[] args) {
		int[] progress = {80, 15, 50};
		int[] speed = {20, 15, 10};
		
		FunctionDevelop dev = new FunctionDevelop();
		
		int[] answer = dev.make(progress, speed);

		System.out.println(Arrays.toString(answer));
	}
}
