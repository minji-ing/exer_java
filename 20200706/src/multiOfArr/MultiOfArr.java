package multiOfArr;
// 행렬의 곱셈 구하기
public class MultiOfArr {
	public static void main(String[] args) {
		int[][] arrA = {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arrB = {{5,4,3},{2,4,1},{3,1,1}};
		int[][] multiArr = new int[arrA.length][arrB[0].length]; //arrA*arrB를 담는 arr 정의
		int i = 0;
		
		while(i < arrA.length) {
			for(int z = 0; z < arrA[i].length; z++) {
				for(int j = 0; j < arrB.length; j++) {
					multiArr[i][z] += arrA[z][j]*arrB[j][z];
				}	
			}
			i++;
		}
		for(int n = 0; n < multiArr.length; n++) {
			for(int m = 0; m < multiArr[n].length; m++) {
				System.out.print(multiArr[n][m]+"\t");
			}
			System.out.println();
		}
	}
}
