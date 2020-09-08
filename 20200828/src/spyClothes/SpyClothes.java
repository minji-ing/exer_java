package spyClothes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 프로그래머스 위장
public class SpyClothes {
	public int make(String[][] clothes) {
		int answer = 0;
		Map<String, Integer> kinds = new HashMap<String, Integer>();
		
		for(int i = 0; i < clothes.length; i++) {
			int count  = 1;
			
			if(kinds.containsKey(clothes[i][1]) == false) {
				kinds.put(clothes[i][1], count);
			} else {
				count = kinds.get(clothes[i][1]) + 1;
				kinds.put(clothes[i][1], count);
			}
		}
		Set keySet = kinds.keySet();
		Iterator itr = keySet.iterator();
		int setting = 1;
		
		for(int i = 0; i < kinds.size(); i++) {
			while(itr.hasNext()) {
				String key = (String) itr.next();
				answer += kinds.get(key);
				setting = setting * kinds.get(key);
			}
		}
		answer += setting;
		
		System.out.println(kinds.toString());
		return answer;
	}
	public static void main(String[] args) {
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		SpyClothes spy = new SpyClothes();
		int answer = spy.make(clothes);
		System.out.println(answer);
	}
}
