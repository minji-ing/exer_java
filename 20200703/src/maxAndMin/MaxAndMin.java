package maxAndMin;

import java.util.Arrays;

public class MaxAndMin {
	public static void main(String[] args) {
		String s = "1 2 3 4";
		String answer = "";
		int len = s.length();
		int[] arrS = new int[len/2 + 1];
		int j = 0;
		
		for(int i = 0; i < arrS.length; i++) {
			if(i == 0) {
				arrS[i] = s.charAt(i);
			} 
			System.out.print(arrS[i]);
		}
	}
}
