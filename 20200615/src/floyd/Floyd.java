package floyd;
// �÷��̵� �˰��� ����Ͽ� �� ���� ���� �ִ� �Ÿ� ���ϱ�
public class Floyd {	
	public static void main(String[] args) {
		int chk = 10000;
		int[][] w = {{0,2,3,chk,7},{5,0,chk,chk,4},
				{2,chk,0,6,chk},{chk,chk,3,0,4},{6,1,7,2,0}};
		System.out.println("w�迭");
		for(int i = 0; i < w.length; i++) {
			for(int j = 0; j < w[i].length; j++) {
				if(w[i][j] == chk) {
					System.out.printf("%s\t","w");
				} else {
					System.out.printf("%d\t", w[i][j]);
				}
			}
			System.out.println();
		}
		// ���� ���� ����
		for(int k = 0; k < w.length; k++) {
			// ���� ����
			for(int i = 0; i < w.length; i++) {
				// ���� ����
				for(int j = 0; j < w.length; j++) {
					// ���ۿ��� �������� �ٷ� ���� ��ΰ� ���İ��� ��κ��� Ŭ ���
					if(w[i][j] > w[i][k]+w[k][j]) {
						w[i][j] = w[i][k]+w[k][j];
					}
				}
			}
		}
		
		System.out.print("\n"+"d�迭"+"\n");
		for(int i = 0; i < w.length; i++) {
			for(int j = 0; j < w[i].length; j++) {
				if(w[i][j] == chk) {
					System.out.printf("%s\t","CHK");
				} else {
					System.out.printf("%d\t",w[i][j]);
				}
			}
			System.out.println();
		}
	}
}
