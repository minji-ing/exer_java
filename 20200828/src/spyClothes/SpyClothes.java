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
			if(kinds.containsKey(clothes[i][1]) == false) {
				kinds.put(clothes[i][1], i);
			} else {
				int n = i - kinds.get(clothes[i][1]);
				kinds.put(clothes[i][1], n);
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
		String[][] clothes = {{"yellow-hat", "headgear"}, {"blue-sunglasses", "eyewear"}, {"green-turban", "headgear"}};
		SpyClothes spy = new SpyClothes();
		int answer = spy.make(clothes);
		System.out.println(answer);
	}
}
