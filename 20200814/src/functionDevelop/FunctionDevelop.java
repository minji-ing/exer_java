package functionDevelop;

import java.util.Arrays;

// ���α׷��ӽ� ��� ���� (����/ť)
public class FunctionDevelop {
	public int[] make(int[] progress, int[] speed) {
		int[] days = new int[progress.length];
		String count = "";
		
		for(int i = 0; i < progress.length; i++) {
			days[i] = (int)Math.ceil((double)(100 - progress[i]) / speed[i]);
			System.out.println(days[i]);
		}
		

		return days;
	}
	
	public static void main(String[] args) {
		int[] progress = {80, 15, 50};
		int[] speed = {20, 15, 10};
		
		FunctionDevelop dev = new FunctionDevelop();
		
		int[] answer = dev.make(progress, speed);

		System.out.println(Arrays.toString(answer));
	}
}
