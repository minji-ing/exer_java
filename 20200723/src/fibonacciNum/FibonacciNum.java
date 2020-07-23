package fibonacciNum;
// 프로그래머스 피보나치 수
public class FibonacciNum {
	public static void main(String[] args) {
		int n = 5;
		int[] f = new int[5];
		
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 0; i < f.length-2; i++) {
			f[i+2] = f[i] + f[i+1];
		}
		
		for(int i = 0; i < f.length; i++) {
			System.out.print(f[i]+"\t");
		}
	}
}
