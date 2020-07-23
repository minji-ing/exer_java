package fibonacciNum;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 피보나치 수
public class FibonacciNum {
	public static void main(String[] args) {
		int n = 31;
		int answer = 0;
		List<Integer> f = new ArrayList<Integer>();
		int[] farr = new int[n+1];
		farr[0] = 0;
		farr[1] = 1;
		f.add(0);
		f.add(1);
		
//		if(n <= 2) {
//			answer = 1;
//		} else {
//			for(int i = 0; i < f.size()-2; i++) {
//				
//			}
//			
//			long answer = f[n]/1234567;	
//		}
	
		for(int i = 0; i < farr.length-2; i++) {
			farr[i+2] = farr[i] + farr[i+1];
		}
		answer = farr[n]%1234567;
		System.out.println(answer);
	}
}
