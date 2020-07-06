package multiOfArr;

public class MultiOfArr {
	public static void main(String[] args) {
		int[][] arrA = {{1,4},{3,2},{4,1}};
		int[][] arrB = {{3,3},{3,3}};
		int[][] multiArr = new int[arrA.length][arrB[0].length];
		
		for(int i = 0; i < multiArr.length; i++) {
			for(int j = 0; j < multiArr[i].length; j++) {
				System.out.print(multiArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
