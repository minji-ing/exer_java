package gugudan2Array;
// 2차원 배열로 구구단 2~9단 출력하기
public class Gugudan2Array {
	int n = 10;
	int[][] gugudan = new int[n][n-1];
	
	public int[][] multiply() {
		int x = 0;
		int y = 0;
		gugudan[x][y] = 0;
		
		for(x = 0; x < n; x++) {
			for(y = 0; y < n-1; y++) {
				if(x == 0 && y != 0) {
					gugudan[x][y] = y+1;
				} else if(x != 0 && y == 0) {
					gugudan[x][y] = x;
				} else {
					gugudan[x][y] = x * (y+1);
				}
			}
		}
		return gugudan;
	}
	
	public void print() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1; j++) {
				System.out.print(gugudan[i][j]+"\t");	
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Gugudan2Array arr = new Gugudan2Array();
		arr.multiply();
		arr.print();
	}
}
