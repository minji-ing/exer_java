package mabangjin;

public class Mabangjin {
	int n;
	int[][] arr;
	int x = 0;
	int y = 0;
	int a;
	
	// 입력받은 4의 배수로 배열 생성
	public Mabangjin(int n) {
		this.n = n;
		a = n/4;
		arr = new int[n][n];
	}
	// 방향 체크하는 메소드 결과값을 받아서 배열 채워넣는 메소드
	public int[][] make() {
		int seq = 1;
		
		for(x = 0; x < n; x++) {
			for(y = 0; y < n; y++) {
				// 순방향일 경우
				if(chk(x, y, a) == true) {
					arr[x][y] = seq;
				} else {
					// 역방향일 경우
					arr[x][y] = n*n - seq + 1;
				}
				seq++;
			}
		}
		return arr;
	}
	
	// 순방향인지 역방향인지 체크하는 메소드
	public static boolean chk(int x, int y, int a) {
		// x, y 좌표가 순방향에 속하면 return true
		if(x < a || x >= a*3) {
			if(y < a || y >= a*3) {
				return true;
			}
		}
		if(x >= a && x < a*3) {
			if(y >= a && y < a*3) {
				return true;
			}
		}
		return false;
	}
	
	// 배열 프린트
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
