package selectNum;

import java.util.Arrays;

public class SelectNum {
	public int[] make(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			//�ڸ� �迭 ����� array ����
			int[] cutArr = new int[commands[i][1] - commands[i][0] + 1];
			//cutArr�� array �߶� ����
			int idx = 0;
			for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
				cutArr[idx] = array[j];
				idx++;
			}
			//�ڸ� �迭 ����
			Arrays.sort(cutArr);
			//���� ����
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
