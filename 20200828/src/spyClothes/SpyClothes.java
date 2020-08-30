package spyClothes;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 위장
public class SpyClothes {
	public int make(String[][] clothes) {
		int answer = 0;
		List<String> clotheKind = new ArrayList<String>();

		clotheKind.add(clothes[0][2]);
		
		for(int i = 1; i < clothes.length; i++) {
			for(int j = 0; j < clotheKind.size(); j++) {
				if(clothes[i][2] != clotheKind.get(j)) {
					clotheKind.add(clothes[i][2]);
				}
			}
		}
		
		for(int i = 0; i < clotheKind.size(); i++) {
			System.out.println(clotheKind.get(i));
		}
		return answer;
	}
	public static void main(String[] args) {
		String[][] clothes = {{"yellow-hat", "headgear"}, {"blue-sunglasses", "eyewear"}, {"green-turban", "headgear"}};
		SpyClothes spy = new SpyClothes();
		spy.make(clothes);
	}
}
