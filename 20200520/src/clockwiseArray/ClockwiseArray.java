package clockwiseArray;

public class ClockwiseArray {
	public int n;
	public int[][] array;
	
	public ClockwiseArray(int n) {
		this.n = n;
		array = new int[n][n];
	}
	
	public int make() {
		int seq = 1;
		int x = 0;
		int y = 0;
		array[x][y] = seq;
		seq = seq + 1;
		int d = 0;
		
		for(; seq <= n*n; seq++) {
			if(d == 0) {
				if(y < n-1 && array[x][y+1] == 0) {
					y++;		
					array[x][y] = seq;
				} else {
					d = 1;
					seq--;
				}
			} else if(d == 1) {
				if(x < n-1 && array[x+1][y] == 0) {
					x++;	
					array[x][y] = seq;
				} else {
					d = 2;
					seq--;
				}
			} else if(d == 2) {
				if(y > 0 && array[x][y-1] == 0) {
					y--;
					array[x][y] = seq;
				} else {
					d = 3;
					seq--;
				}
			} else {
				if(x > 0 && array[x-1][y] == 0) {
					x--;
					array[x][y] = seq;
				} else {
					d = 0;
					seq--;
				}
			}
//			System.out.print(x+","+y+"/"+seq+" ");
		}
		System.out.println();
		return seq;
	}
	
	public void print() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
