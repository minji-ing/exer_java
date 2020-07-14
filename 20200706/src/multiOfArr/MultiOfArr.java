package multiOfArr;
// 프로그래머스(행렬의 곱셈) 구하기
public class MultiOfArr {
	public static void main(String[] args) {
		int[][] arrA = {{1,4},{3,2},{4,1}};
		int[][] arrB = {{3,3},{3,3}};
		int[][] multiArr = new int[arrA.length][arrB[0].length]; //arrA*arrB를 담는 arr 정의
		int i = 0; //arrA 행렬의 row 개수
		
		while(i < arrA.length) { //arrA 행렬의 row 개수만큼 loop
			for(int z = 0; z < arrA[i].length; z++) { //arrA 행렬의 column 개수만큼 loop
				for(int j = 0; j < arrB.length; j++) { //arrB 행렬의 row 개수만큼 loop
					multiArr[i][z] += arrA[i][j]*arrB[j][z];
				}	
			}
			i++;
		}
		//곱셈해준 행렬 출력
		for(int n = 0; n < multiArr.length; n++) {
			for(int m = 0; m < multiArr[n].length; m++) {
				System.out.print(multiArr[n][m]+"\t");
			}
			System.out.println();
		}
	}
}
