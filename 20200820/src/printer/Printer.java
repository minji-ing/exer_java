package printer;
// 프로그래머스 프린터
public class Printer {
	public int printer(int[] priorities, int loc) {
		int answer = 0;
		int prioMax = priorities[loc];
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int loc = 2;
		
		Printer printer = new Printer();
		int answer = printer.printer(priorities, loc);
		
		System.out.println(answer);
	}
}
