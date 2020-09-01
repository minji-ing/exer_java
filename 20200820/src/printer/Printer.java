package printer;
// 프로그래머스 프린터
public class Printer {
	public int printer(int[] priorities, int loc) {
		int answer = 0;
		int prioMax = priorities[loc];
		int num = 0;
		
		for(int i = 0; i < priorities.length; i++) {
			if(priorities[i] > prioMax) {
				num++;
			} else if(priorities[i] == prioMax && i > loc) {
				num++;
			} else if(i == loc || priorities[i] < prioMax) {
				continue;
			} else if(i < loc && priorities[i] == prioMax) {
				continue;
			}
		}
		System.out.println(num);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int loc = 0;
		
		Printer printer = new Printer();
		int answer = printer.printer(priorities, loc);
		
		System.out.println(answer);
	}
}
