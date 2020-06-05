package counterclockwise;

public class Counterclockwise {
	int n;
	int[][] arr;
	
	// �迭 ���� ������
	public Counterclockwise(int n) {
		this.n = n;
		arr = new int[n][n];
	}
	
	// �迭�� �ð� �ݴ�������� ä��� �޼ҵ�
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
	
	// �迭 ��� �޼ҵ�
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
