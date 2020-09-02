package spyClothes;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 위장
public class SpyClothes {
	public int make(String[][] clothes) {
		int answer = 0;
		int kinds = 1;
		List<Integer> idx = new ArrayList<Integer>();
		
		for(int i = 1; i < clothes[0].length; i++) {
			if(clothes[0][0] != clothes[0][i]) {
				kinds++;
				idx.add(i);
			}
		}
		System.out.println(idx.toString());
		return kinds;
	}
	public static void main(String[] args) {
		String[][] clothes = {{"yellow-hat", "headgear"}, {"blue-sunglasses", "eyewear"}, {"green-turban", "headgear"}};
		SpyClothes spy = new SpyClothes();
		int answer = spy.make(clothes);
		System.out.println(answer);
	}
}
