package maxAndMin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxAndMin {
	public static void main(String[] args) {
		String s = "1 2 3 4";
		List<Integer> arrS = new ArrayList<Integer>();
		
		for(int i = 0; i < s.length(); i+=2) {
			arrS.add(Character.getNumericValue(s.charAt(i)));
		}
		Collections.sort(arrS);
		
		String answer = "";
		
		answer = Integer.toString(arrS.get(0));
		answer += " ";
		answer += Integer.toString(arrS.get(arrS.size()-1));
		
		System.out.println(answer);
	}
}
