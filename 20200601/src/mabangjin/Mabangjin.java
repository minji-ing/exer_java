package mabangjin;

public class Mabangjin {
	int n;
	int[][] arr;
	int x = 0;
	int y = 0;
	int a;
	
	// �Է¹��� 4�� ����� �迭 ����
	public Mabangjin(int n) {
		this.n = n;
		a = n/4;
		arr = new int[n][n];
	}
	// ���� üũ�ϴ� �޼ҵ� ������� �޾Ƽ� �迭 ä���ִ� �޼ҵ�
	public int[][] make() {
		int seq = 1;
		
		for(x = 0; x < n; x++) {
			for(y = 0; y < n; y++) {
				// �������� ���
				if(chk(x, y, a) == true) {
					arr[x][y] = seq;
				} else {
					// �������� ���
					arr[x][y] = n*n - seq + 1;
				}
				seq++;
			}
		}
		return arr;
	}
	
	// ���������� ���������� üũ�ϴ� �޼ҵ�
	public static boolean chk(int x, int y, int a) {
		// x, y ��ǥ�� �����⿡ ���ϸ� return true
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
	
	// �迭 ����Ʈ
	public void print() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
