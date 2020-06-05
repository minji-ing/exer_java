package counterclockwise;

public class Counterclockwise {
	int n;
	int[][] arr;
	
	// 배열 생성 생성자
	public Counterclockwise(int n) {
		this.n = n;
		arr = new int[n][n];
	}
	
	// 배열에 시계 반대방향으로 채우기 메소드
	public int[][] make() {
		int seq;
		int x = 0;
		int y = 0;
		int d = 0;
		
		for(seq = 1; seq < n*n; seq++) {
			if(d == 0) {
				if(x+1 < n && arr[x+1][y] == 0) {
					arr[x][y] = seq;
					x++;
				} else {
					d = 1;
					seq--;
				}
			} else if(d == 1) {
				if(y+1 < n && arr[x][y+1] == 0) {
					arr[x][y] = seq;
					y++;
				} else {
					d = 2;
					seq--;
				}
			} else if(d == 2) {
				if(x-1 >= 0 && arr[x-1][y] == 0) {
					arr[x][y] = seq;
					x--;
				} else {
					d = 3;
					seq--;
				}
			} else {
				if(y-1 >= 0 && arr[x][y-1] == 0) {
					arr[x][y] = seq;
					y--;
				} else {
					d = 0;
					seq--;
				}
			}
		}
		return arr;
	}
	
	// 배열 출력 메소드
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
