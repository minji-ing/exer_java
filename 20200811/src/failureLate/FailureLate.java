package failureLate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 프로그래머스 실패율
public class FailureLate {
	public int[] make(int n, int[] stages) {
		int[] answer = new int[n];
		List<Integer> idx = new ArrayList<Integer>();
		String stagesStr = "";
		Arrays.sort(stages);
		
		for(int i = 0; i < stages.length; i++) {
			stagesStr += stages[i];
		}
		System.out.println(stagesStr);
		for(int i = 2; i <= n+1; i++) {
			idx.add(stagesStr.indexOf(Integer.toString(i)));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		
		FailureLate late = new FailureLate();
		
		int[] answer = late.make(n, stages);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
