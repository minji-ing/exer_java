package counterclockwise;

public class Counterclock {
	int n;
	int[][] arr;
	
	// 배열 생성 생성자
	public Counterclock(int n) {
		this.n = n;
		arr = new int[n][n];
	}
	public int[][] make() {
		int seq = 1;
		int x = 0;
		int y = 0;
		int d = 1;
		
		while(seq <= n*n) {
			while(y < n-1) {
				while(x < n-1) {
					arr[x][y] = seq;
					x++;
					seq++;
				}
				arr[x][y] = seq;
				y++;
				seq++;
			}
			while(y > 0) {
				while(x > 0) {
					arr[x][y] = seq;
					x--;
					seq++;
				}
				arr[x][y] = seq;
				y--;
				seq++;
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
