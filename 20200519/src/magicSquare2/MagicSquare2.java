package magicSquare2;
public class MagicSquare2 {
	public int n;
	public int [][] square;
	
	public MagicSquare2(int n) {
		this.n = n;
		square = new int[n][n];
	}
	
	public int make() {
		int seq = 1;
		int x = 0;
		int y = n/2;
		square[x][y] = seq;

		for(; seq <= n*n; seq++) {
			if(seq == 1) {
				continue;
			} else {
					if(x-1 < 0 && y-1 >= 0) {
						x = n-1;
						y--;
					} else if(x-1 >= 0 && y-1 < 0) {
						x--;
						y = n-1;
					} else if(x-1 < 0 && y-1 < 0) {
						x++;
					} else if(square[x-1][y-1] != 0) {
						x++;
					} else {
						x--;
						y--;
					}
			}
			System.out.print(x+","+y+" ");
			square[x][y] = seq;
		}
		System.out.println();
		return seq;
	}
	
	public void print() {
		for(int i = 0; i < square.length; i++) {
			for(int j = 0; j <square[i].length; j++) {
				System.out.print(square[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
