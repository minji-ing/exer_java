package multiOfArr;

public class MultiOfArr {
	public static void main(String[] args) {
		int[][] arrA = {{1,4},{3,2},{4,1}};
		int[][] arrB = {{3,3},{3,3}};
		int[][] multiArr = new int[arrA.length][arrB[0].length];
		
		multiArr[0][0] = arrA[0][0]*arrB[0][0];
		
		for(int i = 0; i < arrA[0].length; i++) {
			for(int j = 0; j < arrB.length; j++) {
				
			}
		}
	}
}
