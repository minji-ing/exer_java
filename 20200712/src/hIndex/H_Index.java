package hIndex;

import java.util.Arrays;

// ���α׷��ӽ� H_Index
public class H_Index {
	public static void main(String[] args) {
		int[] citations = {3,0,1,6,5};
		int midIdx = (citations.length/2);
		
		Arrays.sort(citations);
		int answer = citations[midIdx];
		
		System.out.println(answer);
	}
}
