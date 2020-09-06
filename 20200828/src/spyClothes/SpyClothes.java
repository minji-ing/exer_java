package spyClothes;

import java.util.HashMap;
import java.util.Map;

// 프로그래머스 위장
public class SpyClothes {
	public int make(String[][] clothes) {
		int answer = 0;
		Map<String, Integer> kinds = new HashMap<String, Integer>();
		
		for(int i = 0; i < clothes[0].length; i++) {
			if(kinds.containsKey(clothes[i][1]) == false) {
				kinds.put(clothes[i][1], i);
			}
		}
		System.out.println(kinds.toString());
		return answer;
	}
	public static void main(String[] args) {
		String[][] clothes = {{"yellow-hat", "headgear"}, {"blue-sunglasses", "eyewear"}, {"green-turban", "headgear"}};
		SpyClothes spy = new SpyClothes();
		int answer = spy.make(clothes);
		System.out.println(answer);
	}
}
