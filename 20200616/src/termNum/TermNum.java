package termNum;

public class TermNum {
	public static long[] make(long x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = x*(i+1);
		}
		return answer;
	}
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		long[] answer = TermNum.make(x, n);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+"\t");
		}
	}
}
