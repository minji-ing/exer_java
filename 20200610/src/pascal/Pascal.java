package pascal;

public class Pascal {
	int n;
	int[][] arr;
	
	// 입력받은 n에 대한 배열 생성
	public Pascal(int n) {
		this.n = n;
		arr = new int[n][n];
	}
	
	// 파스칼 삼각형 출력 메소드
	public int[][] make() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(i == 0 && j == 0) {
					arr[i][j] = 1;
				} else {
					if(j == 0 || i == j) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					}
				}
			}
		}
		return arr;
	}
	
	// 배열 출력 메소드
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
