package functionDevelop;
// ���α׷��ӽ� ��� ���� (����/ť)
public class FunctionDevelop {
	public int[] make(int[] progress, int[] speed) {
		int[] answer = {};
		int[] days = new int[progress.length];
		int count = 0;
		
		for(int i = 0; i < progress.length; i++) {
			days[i] = (int)Math.ceil((double)(100 - progress[i]) / speed[i]);
			System.out.println(days[i]);
		}
		
		for(int i = 0; i < days.length-1; i++) {
			if(days[i] < days[i+1]) {
				continue;
			} else {
				for(int j = i+1; j < days.length; j++) {
					if(days[i] < days[j]) {
						
					}
				}
			}
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