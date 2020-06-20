package intDESC;

import java.util.Arrays;

public class IntDESC2 {
	public static void main(String[] args) {
		long n = 118372;
		String strN = Long.toString(n);
		char[] cut = strN.toCharArray();
		String temp = "";
		
		Arrays.sort(cut);
		
		
		for(int i = cut.length-1; i >= 0; i--) {
			temp += cut[i];
		}
		long answer = Long.parseLong(temp);
		System.out.print(answer);
	}
}
