package counterclockwise;

public class CounterClockwise {
	public int n;
	public int[][] arr;
	
	public CounterClockwise(int n) {
		this.n = n;
		arr = new int[n][n];
	}
	
	public int make() {
		int seq = 1;
		int x = 0;
		int y = 0;
		int d = 0;
		arr[x][y] = seq;
		seq = seq + 1;
		
		for(; seq <= n*n; seq++) {
			if(d == 0) {
				if(x <= n-2 && arr[x+1][y] == 0) {
					x++;
					arr[x][y] = seq;
				} else {
					d = 1;
					seq--;
				}
			} else if(d == 1) {
				if(y <= n-2 && arr[x][y+1] == 0) {
					y++;
					arr[x][y] = seq;
				} else {
					d = 2;
					seq--;
				}
			} else if(d == 2) {
				if(x > 0 && arr[x-1][y] == 0) {
					x--;
					arr[x][y] = seq;
				} else {
					d = 3;
					seq--;
				}
			} else {
				if(y > 0 && arr[x][y-1] == 0) {
					y--;
					arr[x][y] = seq;
				} else {
					d = 0;
					seq--;
				}
			}
		}
		return seq;
	}
	
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
