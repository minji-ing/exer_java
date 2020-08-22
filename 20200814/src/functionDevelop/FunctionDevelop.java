package functionDevelop;
// 프로그래머스 기능 개발 (스택/큐)
public class FunctionDevelop {
	public int[] make(int[] progress, int[] speed) {
		int[] answer = {};
		int[] days = new int[progress.length];
		String count = "";
		
		for(int i = 0; i < progress.length; i++) {
			days[i] = (int)Math.ceil((double)(100 - progress[i]) / speed[i]);
			System.out.println(days[i]);
		}
		
		for(int i = 0; i < days.length-1; i++) {
			if(days[i] < days[i+1]) {
				count += "1";
			} else {
				if(days.length <= 3) {
					
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
		
		System.out.println(count);
		return answer;
	}
	
	public static void main(String[] args) {
		int[] progress = {80, 15, 50};
		int[] speed = {20, 15, 10};
		
		FunctionDevelop dev = new FunctionDevelop();
		
		int[] answer = dev.make(progress, speed);
		
		System.out.println(answer);
	}
}
