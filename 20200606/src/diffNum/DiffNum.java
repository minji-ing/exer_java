package diffNum;

import java.util.ArrayList;
import java.util.List;

public class DiffNum {
	int[] answer;
	public int[] make(int[] arr) {
		List<Integer> selectNum = new ArrayList<Integer>();
		
		selectNum.add(arr[0]);
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				selectNum.add(arr[i+1]);
			}
		}
		answer = new int[selectNum.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = selectNum.get(i);
		}
		return answer;
	}
	public void print() {
		System.out.print("[");
		for(int i = 0; i < answer.length; i++) {
			if(i == answer.length-1) {
				System.out.print(answer[i]+"]");
			} else {
				System.out.print(answer[i]+",");
			}
		}
	}
}
