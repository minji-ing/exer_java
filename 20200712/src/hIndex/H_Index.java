package hIndex;

import java.util.Arrays;

// ���α׷��ӽ� H_Index
public class H_Index {
	public static void main(String[] args) {
		int[] citations = {3,0,1,6,5};
		int answer = 0;
		Arrays.sort(citations);
		
		for(int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			
			if(citations[i] >= h) {
				answer = h;
				break;
			}
		}
		System.out.println(answer);
	}
}
