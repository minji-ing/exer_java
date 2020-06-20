package floyd;
// 플로이드 알고리즘 사용하여 두 지점 사이 최단 거리 구하기
public class Floyd {	
	public static void main(String[] args) {
		int chk = 10000;
		int[][] w = {{0,2,3,chk,7},{5,0,chk,chk,4},
				{2,chk,0,6,chk},{chk,chk,3,0,4},{6,1,7,2,0}};
		System.out.println("w배열");
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
		// 거쳐 가는 지점
		for(int k = 0; k < w.length; k++) {
			// 시작 지점
			for(int i = 0; i < w.length; i++) {
				// 도착 지점
				for(int j = 0; j < w.length; j++) {
					// 시작에서 도착으로 바로 가는 경로가 거쳐가는 경로보다 클 경우
					if(w[i][j] > w[i][k]+w[k][j]) {
						w[i][j] = w[i][k]+w[k][j];
					}
				}
			}
		}
		
		System.out.print("\n"+"d배열"+"\n");
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
