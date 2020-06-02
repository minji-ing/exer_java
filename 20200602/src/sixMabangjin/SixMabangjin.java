package sixMabangjin;

// 4개 영역으로 나눠 채우는 마방진 만들기
public class SixMabangjin {
	int n;
	int a;
	int b;
	int x = 0;
	int y = 0;
	int[][] arr;
	
	// 배열 생성하는 생성자
	public SixMabangjin(int n) {
		this.n = n;
		arr = new int[n][n];
		a = n/4;
		b = n/2;
	}
	
	// 마방진 4개 영역으로 나누는 메소드
	public static int partition(int b, int x, int y) {
		int d = 0;
		if(x < b && b <= y) {
			d = 1;
		} else if(b <= x && y < b) {
			d = 2;
		} else if(b <= x && b <= y) {
			d = 3;
		}
		return d;
	}
	
	// 홀수 마방진 채우는 메소드
	public static int[][] lastMake(int b){
		int[][] last = new int[b][b];
		int seq = 1;
		int row = 0;
		int col = 0;
		for(seq = 1; seq <= b*b; seq++) {
			if(seq == 1) {
				row = 0;
				col = b/2;
			} else {
				if(row-1 < 0 && col-1 < 0) {
					row = row+1;
				} else if(row-1 < 0 && col-1 >= 0) {
					row = b-1;
					col = col-1;
				} else if(row-1 >= 0 && col-1 < 0) {
					row = row-1;
					col = b-1;
				} else if(last[row-1][col-1] != 0) {
					row = row+1;
				} else {
					row = row-1;
					col = col-1;
				}
			}
			last[row][col] = seq;
		}
		return last;
	}
	
	// 각 영역 채우는 메소드
	public int[][] make(){
		for(x = 0; x < n; x++) {
			for(y = 0; y < n; y++) {
				if(partition(b,x,y) == 0) {
					if(x != a && y == a-1) {
						arr[x][y] = 3 * b*b;
					} else if(x == a && y == a) {
						arr[x][y] = 3 * b*b;
					}
				} else if(partition(b,x,y) == 1) {
					arr[x][y] = 2 * b*b + lastMake(b)[x][y-b];
				} else if(partition(b,x,y) == 2) {
					if(arr[x-b][y] == 0) {
						arr[x][y] = 3 * b*b;
					}
				} else {
					arr[x][y] = 1 * b*b + lastMake(b)[x-b][y-b];
				}
			}
		}
		for(x = 0; x < n; x++) {
			for(y = 0; y < b; y++) {
				if(partition(b,x,y) == 0) {
					arr[x][y] += lastMake(b)[x][y];
				} else {
					arr[x][y] += lastMake(b)[x-b][y];
				}
			}
		}
		return arr;
	}
	
	// 마방진 출력
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
