package selectNum;

import java.util.Arrays;

public class SelectNum {
	public int[] make(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			//자른 배열 저장용 array 생성
			int[] cutArr = new int[commands[i][1] - commands[i][0] + 1];
			//cutArr에 array 잘라서 저장
			int idx = 0;
			for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
				cutArr[idx] = array[j];
				idx++;
			}
			//자른 배열 정렬
			Arrays.sort(cutArr);
			//정답 삽입
			answer[i] = cutArr[commands[i][2]-1];
		}
		return answer;
	}
	public int[] print(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i]+", ");
			}
		}
		System.out.print("]");
		return arr;
	}
}
