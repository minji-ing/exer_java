package functionDevelop;
// 프로그래머스 기능 개발 (스택/큐)
public class FunctionDevelop {
	public int[] make(int[] progress, int[] speed) {
		int[] answer = {};
		
		for(int i = 0; i < progress.length; i++) {
			int days = (int)Math.ceil((100 - progress[i]) / speed[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] progress = {93, 30, 55};
		int[] speed = {1, 30, 5};
		
		FunctionDevelop dev = new FunctionDevelop();
		
		int[] answer = dev.make(progress, speed);
		
		System.out.println(answer);
	}
}
