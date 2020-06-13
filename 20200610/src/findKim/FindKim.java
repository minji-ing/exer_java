package findKim;

import java.util.Arrays;

// 서울에서 김서방 찾기
public class FindKim {
	public static int find(String[] seoul) {
		int idx = 0;
		
		// 내가 짠것
//		for(int i = 0; i < seoul.length; i++) {
//			if(seoul[i].equals("Kim")) {
//				idx = i;
//			}
//		}
		
		// 다른 사람 풀이
		idx = Arrays.asList(seoul).indexOf("Kim");
		return idx;
	}
	
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim", "Park"};
		int idx = FindKim.find(seoul);
		System.out.println("김서방은 "+idx+"에 있다.");
	}
}
