package sumArray;

public class SumArray {
	public int[][] make(int[][] arr1, int[][] arr2){
		int col = arr1.length;
		int row = arr1[0].length;
		int[][] answer = new int[col][row];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		return answer;
	}
	
	public void print(int[][] answer) {
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < answer[i].length; j++) {
				System.out.print(answer[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1},{2}};
		int[][] arr2 = {{3},{4}};
		SumArray arr = new SumArray();

		arr.print(arr.make(arr1, arr2));
		
	}
}
