package findKim;

import java.util.Arrays;

// ���￡�� �輭�� ã��
public class FindKim {
	public static int find(String[] seoul) {
		int idx = 0;
		
		// ���� §��
//		for(int i = 0; i < seoul.length; i++) {
//			if(seoul[i].equals("Kim")) {
//				idx = i;
//			}
//		}
		
		// �ٸ� ��� Ǯ��
		idx = Arrays.asList(seoul).indexOf("Kim");
		return idx;
	}
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim", "Park"};
		int idx = FindKim.find(seoul);
		System.out.println("�輭���� "+idx+"�� �ִ�.");
	}
}
