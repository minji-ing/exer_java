package hIndex;
// 프로그래머스 H_Index
public class H_Index {
	public static void main(String[] args) {
		int[] citations = {3,0,1,6,5};
		int avg = 0;
		int sum = 0;
		for(int i = 0; i < citations.length; i++) {
			sum += citations[i];
			avg = sum/citations.length;
		}
		
		System.out.println(avg);
	}
}
